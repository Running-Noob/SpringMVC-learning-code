package com.f.springmvc.controller;

import com.f.springmvc.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author fzy
 * @date 2024/2/5 19:44
 */
@Controller
public class DataAction {
    @RequestMapping("/data.action")
    public String data(
            // SpringMVC支持的默认参数类型
            HttpServletRequest request,
            HttpServletResponse response,
            HttpSession session,
            Model model,
            Map map,
            ModelMap modelMap) {
        // 从服务器端携带的数据
        User user = new User("张三", 22);
        // 传递数据
        request.setAttribute("requestUser", user);
        session.setAttribute("sessionUser", user);
        model.addAttribute("modelUser", user);
        map.put("mapUser", user);
        modelMap.addAttribute("modelMapUser", user);
        return "main";
    }
}
