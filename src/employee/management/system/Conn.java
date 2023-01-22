package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //register the driver class
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "Chirag@30"); //created connecting string 
            s = c.createStatement();
        } catch (Exception e) { //sql is external stuff might throw error
            e.printStackTrace();
        }
    }
}
