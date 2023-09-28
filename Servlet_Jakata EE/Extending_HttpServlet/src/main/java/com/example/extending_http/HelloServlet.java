package com.example.extending_http;

import java.io.*;
import java.util.Date;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet
{
    private String message;

    public void init()
    {
        this.message="Nisarg Modi";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Hello "+message+"</h1>");
        out.println("<h1>Current Date & Time is "+new Date().toString()+"</h1>");
        out.close();

    }


}