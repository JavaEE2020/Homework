package com.mypack.controller;


import com.mypack.entity.Student;
import com.mypack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/hello")
    @ResponseBody
    public void hello() {
        //insert
        Student student = new Student()
                .setId(11)
                .setName("李晓明")
                .setAge(23)
                .setAddress("上海");
        studentService.insert(student);

    }

}
