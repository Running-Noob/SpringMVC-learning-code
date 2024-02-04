package com.f.springmvc.controller;

import com.f.springmvc.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fzy
 * @date 2024/2/4 21:40
 */
@Controller
public class DataSubmitAction {
    /**
     *     <form action="${pageContext.request.contextPath}/one.action" method="post">
     *         姓名：<input name="name" value="">
     *         年龄：<input name="age" value="">
     *         <input type="submit" value="提交">
     *     </form>
     */
    @RequestMapping(value = "/one.action", method = RequestMethod.POST)
    public String one(String name, int age) {   // 只需保证参数名和前端对应的名称一致即可
        System.out.println("姓名为：" + name);
        System.out.println("年龄为：" + age);
        return "main";
    }

    /**
     *    <form action="${pageContext.request.contextPath}/two.action" method="post">
     *         姓名：<input name="uname" value="">
     *         年龄：<input name="uage" value="">
     *         <input type="submit" value="提交">
     *     </form>
     *
     *     public class User {
     *          private String uname;
     *          private int uage;
     *          ...
     *     }
     */
    @RequestMapping(value = "/two.action", method = RequestMethod.POST)
    public String two(User user) {  // 需要保证类中的字段名和前端对应的名称一致
        System.out.println(user);
        return "main";
    }

    /**
     * <a href="${pageContext.request.contextPath}/three/张三/22.action">动态占位符提交</a>
     */
    @RequestMapping(value = "/three/{xxx}/{yyy}.action")
    public String three(
            @PathVariable("xxx")
            String aaa, // 类似于起别名
            @PathVariable("yyy")
            int bbb) {  // 前端一杠一值，后端一杠一大括号
        System.out.println("姓名为：" + aaa);
        System.out.println("年龄为：" + bbb);
        return "main";
    }

    /**
     *    <form action="${pageContext.request.contextPath}/four.action" method="post">
     *         姓名：<input name="uname" value="">
     *         年龄：<input name="uage" value="">
     *         <input type="submit" value="提交">
     *     </form>
     */
    @RequestMapping(value = "/four.action", method = RequestMethod.POST)
    public String four(
            @RequestParam("uname")
            String name,
            @RequestParam("uage")
            int age) {
        System.out.println("姓名为：" + name);
        System.out.println("年龄为：" + age);
        return "main";
    }

    /**
     *     <form action="${pageContext.request.contextPath}/five.action" method="post">
     *         姓名：<input name="uname" value="">
     *         年龄：<input name="uage" value="">
     *         <input type="submit" value="提交">
     *     </form>
     */
    @RequestMapping(value = "/five.action", method = RequestMethod.POST)
    public String five(HttpServletRequest request) {
        System.out.println("姓名为：" + request.getParameter("uname"));
        System.out.println("年龄为：" + Integer.parseInt(request.getParameter("uage")));
        return "main";
    }
}
