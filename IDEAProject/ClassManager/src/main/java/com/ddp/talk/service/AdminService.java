package com.ddp.talk.service;


import com.ddp.talk.pojo.Student;

public interface AdminService {
    /**
     * 添加用户
     *
     * @param stu
     * @return
     */
    int addUsers(Student stu);

    /**
     * 根据ID删除用户
     *
     * @param id
     * @return
     */
    int delUsers(int id);

    /**
     * 编辑用户
     *
     * @param stu
     * @return
     */
    int editUsers(Student stu);

}
