package com.f.springmvc.controller;

import com.f.springmvc.pojo.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fzy
 * @date 2024/2/20 14:27
 */
@Controller
public class LoginAction {
    // 通过请求转发跳转到WEB-INF目录下的login.jsp页面上
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin() {
        return "forward:/WEB-INF/jsp/login.jsp";
    }

    // 验证登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, HttpSession session) {
        if ("admin".equalsIgnoreCase(user.getUsername()) && "admin".equalsIgnoreCase(user.getPassword())) {
            // 将用户数据封装在session中
            session.setAttribute("user", user);
            // 跳转至主页
            return "forward:/WEB-INF/jsp/main.jsp";
        }
        session.setAttribute("msg", "用户名或密码不正确");
        return "forward:/WEB-INF/jsp/login.jsp";
    }

    // 退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "forward:/WEB-INF/jsp/login.jsp";
    }

    @RequestMapping("/toMain")
    public String toMain() {
        // 用于测试是否能直接跳转到main.jsp
        return "forward:/WEB-INF/jsp/main.jsp";
    }
}
