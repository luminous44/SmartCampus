package com.smartcampus.campus.Service;

import com.smartcampus.campus.Entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface StudentService {
    List<Student> getAllStudent();
    void save(Student student);
    Student getStudent(Long id);

    void deleteStudent(Long id);
}

