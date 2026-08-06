    package org.example;
    import java.sql.*;
    import java.sql.DriverManager;

    public class Main {


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
            //Execute the query
            String sql = "Insert into student(id, name,age, city ) values(2,'Mrudula',15,'Pune')";
            int row = statement.executeUpdate(sql);
            if(row ==0){
                System.out.println("Data is not inserted");
            }
            else{
                System.out.println("Data inserted successfully");
            }

            //process the result

            // close all the resources
            statement.close();
            connect.close();
        }




    }