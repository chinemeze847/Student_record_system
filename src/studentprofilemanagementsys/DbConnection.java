
package studentprofilemanagementsys;
import java.sql.*;


public class DbConnection {
    
    
    public static Connection dbConnect() throws ClassNotFoundException, SQLException
    {
        String URL = "jdbc:oracle:thin:@localhost:1521:ezedb";
        String USERNAME = "eze";
        String PASSWORD = "thankgod";
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
}
