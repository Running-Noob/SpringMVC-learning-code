package com.f.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fzy
 * @date 2024/2/5 22:14
 */
@Controller
public class AccessAction {
    @RequestMapping("/access.action")
    public String access() {
        System.out.println("开始访问WEB-INF目录下的资源...");
        // 通过请求转发的方式访问WEB-INF目录下的资源
        return "forward:/WEB-INF/jsp/main.jsp";
    }
}
