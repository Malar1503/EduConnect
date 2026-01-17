package com.edutech.progressive.config;

import java.util.Properties;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class DatabaseConnectionManager {

    private static final Properties properties = new Properties();
    private static volatile boolean loaded = false;

    private DatabaseConnectionManager() {}

    private static void loadProperties() {
        if (loaded) return;
        synchronized (DatabaseConnectionManager.class) {
            if (loaded) return;

            final String propsFile = "application.properties";
            try (InputStream is = Thread.currentThread()
                                        .getContextClassLoader()
                                        .getResourceAsStream(propsFile)) {
                if (is == null) {
                    throw new IllegalStateException("application.properties not found on classpath (src/main/resources)");
                }
                properties.load(is);

                String driver = properties.getProperty("db.driver");
                if (driver != null && !driver.isBlank()) {
                    Class.forName(driver);
                }

                if (properties.getProperty("db.url") == null || properties.getProperty("db.url").isBlank()) {
                    throw new IllegalStateException("Missing required property: db.url");
                }

                loaded = true;
            } catch (IOException e) {
                throw new IllegalStateException("Failed to load application.properties", e);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("JDBC Driver class not found", e);
            }
        }
    }

    public static Connection getConnection() throws SQLException {
        if (!loaded) loadProperties();

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        if ((username == null || username.isBlank()) && (password == null || password.isBlank())) {
            return DriverManager.getConnection(url);
        }
        return DriverManager.getConnection(url,
                username == null ? "" : username,
                password == null ? "" : password);
    }
}

