package JDBC_GUI_Update;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class connect 
{
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String username = "postgres";
    private String password = "nisarg";
    
    public int fetch(String s1,String s2) throws Exception
    {
        try
        {
            int x = Integer.parseInt(s1);
           
            Connection conn = null;
            conn = DriverManager.getConnection(url,username,password);
            PreparedStatement st = conn.prepareStatement("update public.person set name ? where id = ?");
            st.setString(1,s2);
            st.setInt(2,x);
            int row = st.executeUpdate();
            
            return row;
            
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
}
public class Java_GUI extends Frame implements ActionListener{
    Button b;
    TextField tf1,tf2;
    TextArea ta;
    
    JDBC_GUI_Update()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        
        b = new Button("update");
        b.setBounds(50, 150, 100, 20);
        tf1 = new TextField(" ");
        tf1.setBounds(50, 50, 100, 20);
        tf2 = new TextField(" ");
        tf2.setBounds(50, 100, 100, 20);
        ta = new TextArea("Display Show");
        ta.setBounds(50,200,200,200);
        
        add(tf1);
        add(tf2);
        add(b);
        add(ta);
        b.addActionListener(this);
        
    }
    
    public void display(int row)
    {
        ta.setText(row+" is affected");
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            connect c = new connect();
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            int row = c.fetch(s1, s2);
            display(row);
        }
        catch(Exception ex)
        {
            ta.setText(ex.toString());
        }
        
    }
       
    public static void main(String[] args) {
        JDBC_GUI_Update jgu = new JDBC_GUI_Update();
    }
    
}
