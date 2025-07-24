package com.smartcampus.campus.Service.Imp;

import com.smartcampus.campus.Entity.Student;
import com.smartcampus.campus.Repository.StudentRepository;
import com.smartcampus.campus.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository repo;
    @Override
    public List<Student> getAllStudent() {
        return repo.findAll();
    }

    @Override
    public void save(Student student) {
        repo.save(student);
    }
}
