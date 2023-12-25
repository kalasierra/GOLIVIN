package com.Group11.TugasBesar.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.Group11.TugasBesar.annotations.CheckPemilikKost;

public class CheckPemilikKostInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            CheckPemilikKost annotation = handlerMethod.getMethod().getAnnotation(CheckPemilikKost.class);
            if (annotation != null) {
                System.out.println("In CheckPemilikKostInterceptor.java:\nUSER_TYPE = " + request.getSession().getAttribute("USER_TYPE"));
                // Check if user is logged in, otherwise redirect to login page
                if (!request.getSession().getAttribute("USER_TYPE").equals("PemilikKost")) {
                    response.sendRedirect("/login");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }
}
