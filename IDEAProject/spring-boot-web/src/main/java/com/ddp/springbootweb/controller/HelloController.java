package com.ddp.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 测试控制器
 *
 * @author 杜先森
 */
@Controller
public class HelloController {

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        List<String> list = new ArrayList<>();
        list.add("郭小杜");
        list.add("杜小普");
        list.add("郭小欣");
        map.put("lists", list);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/su")
    public String su() {
        return "helloWorld";
    }
}
