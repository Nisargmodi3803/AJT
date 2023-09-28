package com.example.login_form;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(value = "/loginform")
public class Login extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
    {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(email.equals("nisargmodi@gmail.com") && password.equals("Nisarg123"))
        {
            out.println("<h1> Login Successfull</h1>");
        }
        else
        {
            out.println("<h1>Wrong credentials</h1>");
        }
    }
}