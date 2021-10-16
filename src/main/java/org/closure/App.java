package org.closure;

import java.sql.*;
public class App {
    public static final String DB_URL = "jdbc:mysql://localhost/springbootcourse";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static void main(String[] args) {
        int rows = 0;
        boolean state = false;
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            conn.setAutoCommit(true);
            PreparedStatement stat = conn.prepareStatement("INSERT INTO user (is_active,password,roles,user_name) VALUES (?,'p@SSW0RD',?,'CPP')");
            stat.setBoolean(1, true);
            stat.setString(2, "ADMIN_ROLE");   
            stat.executeUpdate();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
