package com.smartcampus.campus.Repository;

import com.smartcampus.campus.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
