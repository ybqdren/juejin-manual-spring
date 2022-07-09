package com.github.ybqdren.a.servlet;

import com.github.ybqdren.a.service.DemoService;
import com.github.ybqdren.a.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhao wen
 * @sice 2022/7/9
 **/

@WebServlet(urlPatterns = "/demo1")
public class DemoServlet extends HttpServlet {

    DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoService.findAll().toString());
    }
}
