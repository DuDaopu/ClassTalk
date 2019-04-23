package com.ddp.springbootweb.mapper;

import com.ddp.springbootweb.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 员工映射
 *
 * @author 杜先森
 */
public interface EmployeeMapper {
    /**
     * 插入员工
     *
     * @param e
     * @return
     */
    @Insert("insert into employee(lastName,email,gender,birth,depId)values(#{e.lastName},#{e.email},#{e.gender},#{e.birth},#{e.department.id})")
    int insEmp(@Param("e") Employee e);

    /**
     * 查询所有员工
     *
     * @return
     */
    @Select("select * from employee")
    List<Employee> getAll();

    /**
     * 通过ID查找员工
     *
     * @param id
     * @return
     */
    @Select("select * from employee where id=#{id}")
    Employee get(@Param("id") Integer id);

    /**
     * 通过Id删除员工
     *
     * @param id
     * @return
     */
    @Delete("delete from employee where id =#{id}")
    int delete(@Param("id") Integer id);

    /**
     * 根据Id修改员工信息
     *
     * @param e
     * @return
     */
    @Update("update employee set lastName=#{e.lastName},email=#{e.email},gender=#{e.gender},birth=#{e.birth},depId=#{e.department.id} where id=#{e.id}")
    int updEmpById(@Param("e") Employee e);
}
