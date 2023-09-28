import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author postgresqltutorial.com
 */
public class JavaApplication1{

    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "nisarg";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from public.person");
            
            while(rs.next())
            {
                System.out.println(rs.getString(1)+"   "+rs.getString(2));
            }
            
            st.close();
            conn.close();
            
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication1 app = new JavaApplication1();
        app.connect();
    }
}