package com.smartcampus.campus.Controller;

import com.smartcampus.campus.Entity.Student;
import com.smartcampus.campus.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public String getAllStudents(Model model){
        model.addAttribute("students",service.getAllStudent());
        return "student";
    }
    @GetMapping("/addStudent")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent"; // this should be your HTML page name (addStudent.html)
    }


    @PostMapping("/createStudent")
    public String createStudent(@ModelAttribute Student student) {
        service.save(student);
        return "redirect:/students";
    }

}
