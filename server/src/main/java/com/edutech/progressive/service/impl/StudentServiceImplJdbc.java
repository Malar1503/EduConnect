package com.edutech.progressive.service.impl;

import java.util.List;

import com.edutech.progressive.dao.StudentDAO;
import com.edutech.progressive.entity.Student;

public class StudentServiceImplJdbc {
    private StudentDAO studentDAO;

public List<Student> getAllStudents(){
    return List.of();
}

    public Integer addStudent(Student student) {
        return -1;
    }

    public List<Student> getAllStudentSortedByName() {
        return List.of();
    }

    public void updateStudent(Student student) {

    }

    public void deleteStudent(int studentId) {

    }

    public Student getStudentById(int studentId) {
        return null;
    }

}