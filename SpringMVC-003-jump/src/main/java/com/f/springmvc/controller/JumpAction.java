package com.f.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fzy
 * @date 2024/2/5 17:19
 */
@Controller
public class JumpAction {
    @RequestMapping("/one.action")
    public String one() {
        System.out.println("默认为请求转发页面...");
        return "main";  // 默认是请求转发，使用视图解析器拼接前缀后缀，然后进行页面跳转
    }

    @RequestMapping("/two.action")
    public String two() {
        System.out.println("请求转发action...");
        // 使用"forward:"可以屏蔽视图解析器前缀后缀的拼接
        return "forward:/other.action"; // 请求转发action
    }

    @RequestMapping("/three.action")
    public String three() {
        System.out.println("重定向页面...");
        // 使用"redirect:"可以屏蔽视图解析器前缀后缀的拼接
        return "redirect:/admin/main.jsp"; // 重定向页面
    }

    @RequestMapping("/four.action")
    public String four() {
        System.out.println("重定向action...");
        // 使用"redirect:"可以屏蔽视图解析器前缀后缀的拼接
        return "redirect:/other.action"; // 重定向action
    }
}
