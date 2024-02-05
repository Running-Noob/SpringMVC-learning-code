package com.f.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fzy
 * @date 2024/2/5 17:25
 */
@Controller
public class OtherAction {
    @RequestMapping("/other.action")
    public String other() {
        System.out.println("跳转到了/other.action");
        return "main";
    }
}
