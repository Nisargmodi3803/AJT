package com.example.addition_of_2_number;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(name = "ADD", value = "/addition")
public class AdditionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        int a = Integer.parseInt(request.getParameter("n1"));
        int b = Integer.parseInt(request.getParameter("n2"));
        int c = a+b;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Addtion using servlet</h1>");
        out.println("<h1>Addtion of "+a+" & "+b+" is "+c+"</h1>");
    }
}