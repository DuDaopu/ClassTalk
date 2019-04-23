package com.ddp.springbootweb.mapper;

import com.ddp.springbootweb.pojo.Department;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门映射
 *
 * @author 杜先森
 */
public interface DepartmentMapper {
    /**
     * 查找所有部门
     *
     * @return
     */
    @Select("select * from department")
    List<Department> selDepartments();

    /**
     * 根据ID查找部门
     *
     * @param id
     * @return
     */
    @Select("select * from department where id =#{id}")
    Department selDepartById(@Param("id") Integer id);
}
