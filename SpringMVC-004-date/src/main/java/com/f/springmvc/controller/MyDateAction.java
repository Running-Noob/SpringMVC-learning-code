package com.f.springmvc.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author fzy
 * @date 2024/2/5 20:22
 */
@Controller
public class MyDateAction {
    // 注册一个全局的日期处理注解
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // 注册一个自定义的转换器
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd"), true
        ));
    }

    @RequestMapping("/mydate.action")
    public String myDate(
            @RequestParam("mydate")
            Date mydate) {
        System.out.println(mydate);
        return "main";
    }
}
