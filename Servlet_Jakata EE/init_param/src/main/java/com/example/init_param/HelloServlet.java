package com.example.init_param;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/enter")
public class HelloServlet extends HttpServlet {

    private int value;
    public void init(ServletConfig sc)
    {
        value = Integer.parseInt(sc.getInitParameter("param"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<h1>init-param value = "+value+"</h1>");
    }

    public void destroy() {
    }
}