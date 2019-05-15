package com.ddp.talk.controller;

import java.util.List;

import com.ddp.talk.pojo.Student;
import com.ddp.talk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 展示页面
     *
     * @param model
     * @return
     */
    @RequestMapping("/")
    public String index(Model model) {
        List<Student> list = userService.select();
        model.addAttribute("user", list);
        return "show";
    }

    /**
     * 修改界面
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/editA")
    public String editA(Model model, int id) {
        Student list = userService.selectid(id);
        model.addAttribute("user", list);
        return "edit";
    }

    /**
     * 编辑界面
     *
     * @param student
     * @return
     */
    @RequestMapping("/edit")
    public String edit(Student student) {
        int i = userService.addStudent(student);
        if (i == 1) {
            return "redirect:/";
        }
        return "error";
    }

}
