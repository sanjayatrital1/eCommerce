package com.mumstore.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class    LogoutController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie = new Cookie("user", null);
        cookie.setMaxAge(0);
        resp.addCookie(cookie);
        cookie = new Cookie("mail", null);
        cookie.setMaxAge(0);
        resp.addCookie(cookie);
        cookie = new Cookie("holder", null);
        cookie.setMaxAge(0);
        resp.addCookie(cookie);

        req.getSession().invalidate();
        resp.sendRedirect("/");
    }

}
