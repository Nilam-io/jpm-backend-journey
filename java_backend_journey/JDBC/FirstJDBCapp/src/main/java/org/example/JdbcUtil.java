package org.example;
import java.sql.*;
import java.sql.DriverManager;

public class JdbcUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    private static final String USER = "root";
    private static final String PASSWORD = "Nil@m226";
    public static void loadDriver(){
        /* contains the steps of methods required to form the, JDBC connection
         1) load and register class driver
         2) form the connection and return it
         3) close statements for the connection, Statement and ResultSet
         */

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public static  Connection getConnect(){
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return connect;

    }
    // Close Statement
    public static void close(Statement statement) {

        try {
            if (statement != null) {
                statement.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Close Connection
    public static void close(Connection connect) {

        try {
            if (connect != null) {
                connect.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // Close ResultSet
    public static void close(ResultSet rs) {

        try {
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

