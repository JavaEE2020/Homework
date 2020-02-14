package com.mypack.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mypack.entity.Student;

public interface StudentService extends IService<Student> {

    void insert(Student student);
}
