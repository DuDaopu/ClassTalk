package com.ddp.talk.controller;

import java.util.List;

import com.ddp.talk.pojo.Student;
import com.ddp.talk.service.AdminService;
import com.ddp.talk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;

    /**
     * 管理员界面
     *
     * @param model
     * @return
     */
    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("st", "");
        return "admin-table";
    }

    /**
     * 添加学生
     *
     * @return
     */
    @RequestMapping("/addUser")
    public String addUserRedirect() {
        return "addUser";
    }

    /**
     * 删除学生
     *
     * @param model
     * @return
     */
    @GetMapping("/delUser")
    public String delUser(Model model) {
        List<Student> list = userService.select();
        model.addAttribute("user", list);
        return "delUser";
    }

    /**
     * 跳转至用户修改页面
     *
     * @param model
     * @return
     */
    @GetMapping("/editUser")
    public String jumpToUser(Model model) {
        List<Student> list = userService.select();
        model.addAttribute("user", list);
        return "editUser";
    }

    /**
     * 学生添加
     *
     * @param stu
     * @param model
     * @return
     */
    @PostMapping("/addUsers")
    public String addUser(Student stu, Model model) {
        System.out.println("11111"+stu.getStuname());
        int i = adminService.addUsers(stu);

        if (i == 1) {
            model.addAttribute("st", "添加成功！");
        } else {
            model.addAttribute("st", "添加失败！");
        }
        return "admin-table";
    }

    /**
     * 删除用户
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/delUsers")
    public String delUsers(int id, Model model) {
        System.out.println("========"+id);
        int i = adminService.delUsers(id);
        System.out.println("_________"+i);
        if (i == 1) {
            model.addAttribute("st", "删除成功！");
        } else {
            model.addAttribute("st", "删除失败！");
        }
        return "admin-table";
    }

    /**
     * 编辑用户
     *
     * @param stu
     * @param model
     * @return
     */
    @PostMapping("/editUser")
    public String editUsers(Student stu, Model model) {
        System.out.println(stu.getId() + stu.getStuname());
        int i = adminService.editUsers(stu);

        if (i == 1) {
            model.addAttribute("st", "编辑成功！");
        } else {
            model.addAttribute("st", "编辑失败！");
        }
        return "admin-table";
    }
}
