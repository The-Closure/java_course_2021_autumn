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
            Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stat.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                System.out.println(rs.getString("password"));
                while (rs.previous()) {
                    System.out.println(rs.getString("password"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
