/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc_connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Nisarg Modi
 */
public class JDBC_Connection {

    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String username = "postgres";
    private String password = "nisarg";

    public Connection connect() {
        //class.forName("org. postgresql. Driver");
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Sucessfull Established");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from public.person where id=2;");
            //SQL Injection...
//            rs = st.executeQuery("Select * from public.person where id=2 or '5'='5'");
            
            while (rs.next()) {
                System.out.println(rs.getString(1) + "    " + rs.getString(2));
            }
            
            st.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public static void main(String[] args) {
        JDBC_Connection jc = new JDBC_Connection();
        jc.connect();
    }

}
