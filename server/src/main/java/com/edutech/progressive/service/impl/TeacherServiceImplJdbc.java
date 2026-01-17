package com.edutech.progressive.service.impl;

import java.util.List;

import com.edutech.progressive.dao.TeacherDAO;
import com.edutech.progressive.entity.Teacher;

public class TeacherServiceImplJdbc {

    private TeacherDAO teacherDAO;

    public List<Teacher> getAllTeachers() {
        return List.of();
    }

    public Integer addTeacher(Teacher teacher) {
        return -1;
    }

    public List<Teacher> getTeacherSortedByExperience() {
        return List.of();
    }

    public void updateTeacher(Teacher teacher) {

    }

    public void deleteTeacher(int teacherId) {

    }

    public Teacher getTeacherById(int teacherId) {
        return null;
    }

}