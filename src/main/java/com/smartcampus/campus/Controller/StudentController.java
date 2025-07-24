package com.smartcampus.campus.Controller;

import com.smartcampus.campus.Entity.Student;
import com.smartcampus.campus.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/editStudent/{id}")

    public String editStudent(@PathVariable("id") Long id,Model model){
        Student student = service.getStudent(id);
        model.addAttribute("student",student);
        return "EditStudent";
    }


    @RequestMapping("/deleteStudent/{id}")

    public String deleteStudent(@PathVariable("id") Long id){
        service.deleteStudent(id);
        return "redirect:/students";
    }



}
