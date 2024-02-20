package com.f.springmvc.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author fzy
 * @date 2024/2/20 14:44
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 判断是否登录过
        if (request.getSession().getAttribute("user") == null) {
            request.setAttribute("msg", "您还未登录, 请先登录...");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
            return false;
        }
        // 放行请求
        return true;
    }
}
