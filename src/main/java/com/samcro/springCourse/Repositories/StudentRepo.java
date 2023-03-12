package com.samcro.springCourse.Repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.samcro.springCourse.Models.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
    
}
