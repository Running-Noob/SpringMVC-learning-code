package com.f.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fzy
 * @date 2024/2/4 16:21
 */
@Controller
@RequestMapping("/hi")
public class HiAction {
    @RequestMapping("/demo.action")
    public String hi() {
        System.out.println("访问服务器hi成功！");
        return "main";
    }
}
