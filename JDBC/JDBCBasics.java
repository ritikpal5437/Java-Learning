package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBasics {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ritik";
        String username = "root";
        String password = "123456";

        String query = "CREATE TABLE student (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "age INT)";



        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            st.execute(query);

            System.out.println("Table Created Successfully!");
            st.close();
            con.close();
            System.out.println("Connection Closed.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}






