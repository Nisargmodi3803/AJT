package com.example.student_registration_exp6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect
{
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String username = "postgres";
    private final static String password = "nisarg";

    public static Connection getconnection() throws SQLException {
        try
        {
            //Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url,username,password);
        }
        catch (SQLException e)
        {
            throw new SQLException("Driver not found",e);
        }

    }
}
