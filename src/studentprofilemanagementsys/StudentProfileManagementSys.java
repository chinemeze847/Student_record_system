
package studentprofilemanagementsys;


import java.sql.*;

public class StudentProfileManagementSys {

    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
        GetStudentFrame frame = new GetStudentFrame();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
    }
}
