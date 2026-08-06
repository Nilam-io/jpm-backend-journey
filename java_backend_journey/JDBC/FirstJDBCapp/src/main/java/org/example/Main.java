package org.example;
import java.sql.*;
import java.sql.DriverManager;

public class Main {
    public Main() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("JDBC is configured successfully!");
        //Load and Register Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Connection to the Database
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "nilam123";


         Connection connect= DriverManager.getConnection(url , user, password);
    }

    private Connection connect;
    // Creating statement object
    Statement statement = connect.createStatement();
    //Execute the query
    //process the result

    // close all the resources
    statement.close();
    connect.close();

}