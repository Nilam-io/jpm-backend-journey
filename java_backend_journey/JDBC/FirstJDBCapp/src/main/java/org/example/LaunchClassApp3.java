
package org.example;
import java.sql.*;
import java.sql.DriverManager;

public class LaunchClassApp3 {


    public static void main(String[] args) throws SQLException {
        Connection connect = null;
        Statement statement = null;
        System.out.println("JDBC is configured successfully!");
        //Load and Register Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            // Connection to the Database
            String url = "jdbc:mysql://localhost:3306/jdbc_demo";
            String user = "root";
            String password = "Nil@m226";
             connect = DriverManager.getConnection(url, user, password);
            // Creating statement object
             statement = connect.createStatement();
//            Execute the query
            //it holdes the method known as, execute which helps to execute selective and non selective at once
            String sql = "Select  * from student where id = 2";
            boolean status = statement.execute(sql);
            if (status) {
                //Select opertaion
                ResultSet rs = statement.getResultSet();
                while (rs.next()) {
                    System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
                }
            } else {
                int rows = statement.getUpdateCount();
                if (rows == 0) {
                    System.out.println("Operation failed");

                } else {
                    System.out.println("Operation Executed");
                }
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            statement.close();
            connect.close();
        }


        //process the result

        // close all the resources


    }




}











