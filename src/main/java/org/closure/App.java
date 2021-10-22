package org.closure;

import java.sql.*;

public class App {
    public static final String DB_URL = "jdbc:mysql://localhost/springbootcourse";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    public static void main(String[] args) {
        int rows = 0;
        boolean state = false;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            conn.setAutoCommit(false);
            Statement stat = conn.createStatement();
            stat.executeUpdate("INSERT INTO user (is_active,password,roles,user_name) VALUES (1,'pass','role','name')");
            stat.executeUpdate("INSERT INTO user VALUES ('pass','role','name')");
            conn.commit();

        } catch (SQLException e) {
            if(conn != null)
            {
                try {
                    conn.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }

}
