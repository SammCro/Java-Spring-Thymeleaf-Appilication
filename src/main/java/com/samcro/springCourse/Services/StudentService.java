package com.samcro.springCourse.Services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.samcro.springCourse.Repositories.StudentRepo;
import com.samcro.springCourse.Models.Student;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student){
       return studentRepo.save(student);
    }
}
