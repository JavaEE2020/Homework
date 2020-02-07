package com.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.Student;
import com.mypack.service.StudentServiceIF;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentServiceIF studentService;

    // 查询所有学生
    @RequestMapping("/listall")
    public String queryAllStu(Model model) {
        List<Student> stuList = studentService.queryAllStu();
        model.addAttribute("student", stuList);
        return "index";
    }

}


