package com.ddp.springbootweb.controller;

import com.ddp.springbootweb.pojo.Department;
import com.ddp.springbootweb.pojo.Employee;
import com.ddp.springbootweb.service.impl.DepartmentServiceImpl;
import com.ddp.springbootweb.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


/**
 * 员工控制器
 *
 * @author 杜先森
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;
    @Autowired
    DepartmentServiceImpl departmentService;

    /**
     * 查询所有员工列表
     *
     * @return
     */
    @GetMapping("/emps")
    public String empList(Model model) {
        Collection<Employee> employees = employeeService.getAll();
        for (Employee employee : employees) {
            Department department = departmentService.queryDepById(employee.getDepId());
            employee.setDepartment(department);
        }
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    /**
     * 转跳到添加页面
     *
     * @param model
     * @return
     */
    @GetMapping("emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentService.selDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    /**
     * 添加用户
     *
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        employeeService.addEmp(employee);
        return "redirect:/emps ";
    }

    /**
     * 通过Id获取员工信息并跳转到修改页面
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeService.getById(id);
        Collection<Department> departments = departmentService.selDepartments();
        model.addAttribute("depts", departments);
        model.addAttribute("emp", employee);
        return "emp/update";
    }

    /**
     * 员工修改
     *
     * @param employee
     * @return
     */
    @PutMapping("/emp")
    public String editEmp(Employee employee) {
        System.out.println("修改=====》" + employee);
        employeeService.changeEmp(employee);
        return "redirect:/emps";
    }

    /**
     * 通过Id删除员工
     * @param id
     * @return
     */
    @DeleteMapping("/emp/{id}")
    public String delEmp(@PathVariable("id") Integer id) {
        employeeService.delete(id);
        return "redirect:/emps";
    }
}
