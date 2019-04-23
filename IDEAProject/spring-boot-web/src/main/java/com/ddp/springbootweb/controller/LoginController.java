package com.ddp.springbootweb.controller;

import com.ddp.springbootweb.pojo.Users;
import com.ddp.springbootweb.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 登陆控制器
 *
 * @author 杜先森
 */
@Controller
public class LoginController {
    @Autowired
    UsersServiceImpl usersService;

    /**
     * 用户登陆
     *
     * @param username
     * @param password
     * @param map
     * @param session
     * @return
     */
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String, Object> map, HttpSession session) {

        Users user = new Users();
        user.setUserName(username);
        user.setPassword(password);
        Users login = usersService.login(user);
        if (login != null) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            map.put("msg", "用户名或密码错误！！！");
            return "login";
        }
    }

    /**
     * 用户退出
     * @param session
     * @return
     */
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("loginUser");
        return "redirect:/";
    }

}
