package org.example;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class LCApp4 {
    public static void main(String[] args) {
        JdbcUtil.loadDriver();
        Connection connect = null;
        Statement statement = null;

        PreparedStatement pstmnt = null;
        try{
            connect = JdbcUtil.getConnect();
//            statement = connect.createStatement();

            String sql =  "Insert into student (id,name,age,city) values(?,?,?,?)";
               pstmnt =   connect.prepareStatement(sql);
          System.out.println("Enter the Student data:");
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the id:");
          int id =sc.nextInt();
            System.out.println("Enter the name:");
            String name =sc.next();
            System.out.println("Enter the age:");
            int age =sc.nextInt();
            System.out.println("Enter the city:");
            String city =sc.next();

            pstmnt.setInt(1,id);
            pstmnt.setString(2,name);
            pstmnt.setInt(3,age);
            pstmnt.setString(4,city);

           int  rs = pstmnt.executeUpdate();
           if(rs ==0){
               System.out.println("Operation failed");

           }
           else{

               System.out.println("Operation Succesfull");
           }

        }
        catch (SQLException e) {

            e.printStackTrace();

        } finally {


            JdbcUtil.close(statement);
            JdbcUtil.close(connect);
        }
    }
}
