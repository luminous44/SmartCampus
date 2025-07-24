package com.smartcampus.campus.Controller;

import com.smartcampus.campus.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;

}
