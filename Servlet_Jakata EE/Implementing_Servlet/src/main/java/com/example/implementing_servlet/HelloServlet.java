package com.example.implementing_servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloServlet implements Servlet
{
    ServletConfig config;
    //LifeCycle Methods...
    @Override
    public void init(ServletConfig config)
    {
        this.config = config;
        System.out.println("Creating Object....");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        System.out.println("Servicing....");

        //Set Content type of the response...
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Service method is running</h1>");
        out.println("<h1>Today's date & time is"+new Date().toString()+"</h1>");
    }

    @Override
    public void destroy()
    {
        System.out.println("Destroying the object...");
    }

    //Non-LifeCycle Methods...

    @Override
    public ServletConfig getServletConfig()
    {
        System.out.println("Returing servletConfig object");
        return config;
    }

    @Override
    public String getServletInfo()
    {
        System.out.println("Returing information about Servlet...");
        return "this servlet is created by Nisarg Modi";
    }
}