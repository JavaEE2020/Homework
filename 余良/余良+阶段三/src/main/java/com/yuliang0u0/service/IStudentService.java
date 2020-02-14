package com.yuliang0u0.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuliang0u0.entity.Student;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author yuliang0u0
 * @date 2020/2/14 - 15:00
 */
public interface IStudentService extends IService<Student> {
    Object findList(IPage<Student> page);
}
