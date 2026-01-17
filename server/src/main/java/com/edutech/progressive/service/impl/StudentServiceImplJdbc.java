package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.StudentDAO;
import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.StudentService;

public class StudentServiceImplJdbc implements StudentService {
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudents() {
       return new ArrayList<>();
    }

    @Override
    public Integer addStudent(Student student) {
       
        return -1;
    }

    @Override
    public List<Student> getAllStudentSortedByName() {
       return new ArrayList<>();
    }

    @Override
    public void updateStudent(Student student) {
       
    }
    @Override
    public void deleteStudent(int studentId) {
       
    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }


    
    

   

}