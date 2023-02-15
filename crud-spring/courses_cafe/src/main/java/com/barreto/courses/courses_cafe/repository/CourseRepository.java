package com.barreto.courses.courses_cafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barreto.courses.courses_cafe.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    
}
