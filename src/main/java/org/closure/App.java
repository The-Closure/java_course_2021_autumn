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
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM user WHERE id=4");
            rs.next();
            System.out.println("your password has been hacked : "+rs.getString("user_name"));
            rows = stat.executeUpdate("INSERT INTO user (id,user_name,password,is_active) VALUES ('java','P@ssw0rd',1)");
            rows = stat.executeUpdate("UPDATE user set is_active = 0");
            state = stat.execute("SELECT * FROM user WHERE id=4");
            state = stat.execute("UPDATE user set is_active = 0");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
