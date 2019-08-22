package com.mywork.sc.filter;


import com.mywork.sc.entity.Users;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        HttpSession session = req.getSession();
        String requestURi = req.getRequestURI();

        boolean b = requestURi.endsWith("showCategaryAll") || requestURi.endsWith("login") || requestURi.endsWith("emailOrMobel")|| requestURi.endsWith("login.jsp") || requestURi.endsWith("register.jsp");

        if(b){
            chain.doFilter(req,resp);
        }else{

            Users userInfo = (Users) session.getAttribute("userInfo");

            if (userInfo                     != null){
                chain.doFilter(req,resp);
            }else {
                resp.sendRedirect("http://localhost:8080/SC/login.jsp");
            }
        }

    }

    @Override
    public void destroy() {

    }
}
