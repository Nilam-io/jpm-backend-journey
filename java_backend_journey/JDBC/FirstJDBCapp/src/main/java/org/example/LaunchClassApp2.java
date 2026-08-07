
package org.example;
import java.sql.*;
import java.sql.DriverManager;

public class LaunchClassApp2 {


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
        String password = "Nil@m226";
        Connection connect= DriverManager.getConnection(url , user, password);
        // Creating statement object
        Statement statement = connect.createStatement();
//            Execute the query
    String sql = "Select * From student";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            System.out.println(" "+rs.getInt(1)+ " "+ rs.getString(2) + " "+rs.getInt(3)+" "+rs.getString(4));
        }



        //process the result

        // close all the resources
        rs.close();
        statement.close();
        connect.close();
    }




}










