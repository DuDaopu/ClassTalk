package com.ddp.talk.service;

import com.ddp.talk.pojo.Student;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     *
     * @return
     */
    List<Student> select();

    /**
     * 根据ID查询用户
     *
     * @param id
     * @return
     */
    Student selectid(int id);

    /**
     * 添加学生
     *
     * @param student
     * @return
     */
    int addStudent(Student student);
}
