package com.edutech.progressive.entity;

import java.sql.Date;

public class Student {
    private int studentId;
    private String fullName;
    private Date dateOfBirth;
    private String contanctNumber;
    private String email;
    private String address;
    public Student() {
    }
    public Student(int studentId, String fullName, Date dateOfBirth, String contanctNumber, String email,
            String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contanctNumber = contanctNumber;
        this.email = email;
        this.address = address;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getContanctNumber() {
        return contanctNumber;
    }
    public void setContanctNumber(String contanctNumber) {
        this.contanctNumber = contanctNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}