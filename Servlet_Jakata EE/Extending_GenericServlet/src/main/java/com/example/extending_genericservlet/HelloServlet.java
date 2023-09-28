package com.example.extending_genericservlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloServlet extends GenericServlet
{
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        System.out.println("Servicing...");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Service method is running(GenericServlet) </h1>");
        out.println("<h1>Current Date & time is "+new Date().toString()+"</h1>");
    }
}