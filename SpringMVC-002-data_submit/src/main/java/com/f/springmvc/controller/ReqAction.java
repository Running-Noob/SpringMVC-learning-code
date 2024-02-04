package com.f.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fzy
 * @date 2024/2/4 16:55
 */
@Controller
public class ReqAction {
    @RequestMapping(value = "/req.action", method = RequestMethod.GET)
    public String doGet() {
        System.out.println("get请求处理");
        return "main";
    }

    @RequestMapping(value = "/req.action", method = RequestMethod.POST)
    public String doPost() {
        System.out.println("post请求处理");
        return "main";
    }
}
