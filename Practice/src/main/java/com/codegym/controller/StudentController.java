package com.codegym.controller;

import com.codegym.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    @GetMapping("/new")
    public String newForm(){
        System.out.println("asfajbfe");
        return "students/new";
    }
    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(
            @RequestParam("studentId") String StudentId,
            @RequestParam("name") String name,
            Model model){

        model.addAttribute("studentId", StudentId);
        model.addAttribute("name", name);
        return "students/viewDetail";
    }
    @PostMapping("/update")
    public String update(
            Student student,
            Model model
            ){
        model.addAttribute("studentId", student.getStudentId());
        model.addAttribute("name", student.getName());
        return "students/viewDetail";
    }
    @GetMapping("/students/edit/${studentId}")
    public String edit(@PathVariable("studentId") String StudentId,Model model){
        System.out.println("Student ID: " + StudentId);
        Student student = new Student();
        student.setStudentId(StudentId);
        student.setName("Phuong");
        model.addAttribute("student", student);
        return "students/edit";
    }
    @RequestMapping("/list")
    public String list(){
        return "students/list";
    }
    @RequestMapping("/search")
    public String search(){
        return "students/search";
    }
}
