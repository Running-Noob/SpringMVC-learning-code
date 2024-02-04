package com.f.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fzy
 * @date 2024/2/4 14:42
 */
@Controller // 由Spring来创建该类的实例对象
@RequestMapping("/hello")
public class HelloAction {
    /**
     * 作为对比，看看以前的servlet方法规范：
     * protected void doGet(HttpServletRequest request, HttpServletResponse response)
     *             throws ServletException, IOException {......}
     */
    /**
     * action中所有功能的实现都是由方法来完成的
     * action中方法的规范
     *  1.修饰符是public
     *  2.方法返回值任意
     *  3.方法的名称任意
     *  4.方法可以没有参数，如果有，可以任意类型
     *  5.要使用@RequestMapping注解，来声明一个访问路径
     */
    @RequestMapping("/demo.action")
    public String hello() {
        System.out.println("访问服务器hello成功！");
        return "main";  // 这样可以直接跳到 /admin/main.jsp 页面上
    }
}
