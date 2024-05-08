package DBconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    public static void main(String[] args) {
        // Database URl
        String url="jdbc:postgresql://localhost:5432/TestDb";
       // Database credentials
        String user ="postgres";
        String password="8859";

        try{
           //Registering the PostgreSQl JDBC driver
            Class.forName("org.postgresql.Driver");
            // Establishing the connection
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("connected to the Postgresql server successfully");
            // close the connection
            connection.close();

        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("connection failed");
            e.printStackTrace();
        }
    }
}
