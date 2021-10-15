package org.closure;

import java.sql.*;
public class App {
    public static final String DB_URL = "jdbc:mysql://localhost/springbootcourse";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM user WHERE id=4");
            rs.next();
            System.out.println("your password has been hacked : "+rs.getString("user_name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
