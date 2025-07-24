package com.smartcampus.campus.Repository;

import com.smartcampus.campus.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
