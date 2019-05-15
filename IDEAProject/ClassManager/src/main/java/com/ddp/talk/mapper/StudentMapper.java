package com.ddp.talk.mapper;


import com.ddp.talk.pojo.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface StudentMapper {
    @Select("select id,stuname,content from student")
    List<Student> selAll();

    @Insert("insert into student(stuname) values (#{stu.stuname})")
    int insStudent(@Param("stu") Student stu);

    @Update("update student set stuname=#{stu.stuname} where id=#{stu.id}")
    int updStudentById(@Param("stu") Student stu);

    @Delete("delete from student where id=#{id}")
    int delStudentById(@Param("id") int id);

    @Select("select id,stuname,content from student where id=#{id}")
    Student selById(@Param("id") int id);

    @Update("update student set content=#{stu.content} where id=#{stu.id}")
    int updContentById(@Param("stu") Student student);
}