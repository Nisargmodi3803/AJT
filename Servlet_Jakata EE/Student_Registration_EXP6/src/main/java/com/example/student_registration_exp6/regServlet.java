package com.example.student_registration_exp6;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class regServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = request.getIntHeader("id");
        String name = request.getParameter("name");
        try
        {
            Connection conn = connect.getconnection();
            String query = "select * from public.students where id = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();

            if(!rs.next())
            {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                out.println("<h1>Student ID already exits with name "+name+"</h1>");
            }
            else
            {

                String query2 = "insert into public.students values(?,?)";

                PreparedStatement ps1 = conn.prepareStatement(query2);
                ps1.setInt(1,id);
                ps1.setString(2, name);

                int row = ps1.executeUpdate();

                out.println("<h1>"+name+" Welcome!!!</h1>");
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
                requestDispatcher.forward(request,response);
            }
        } catch (SQLException e)
        {
            out.println("Error : "+e.getMessage());
        }

    }
}
