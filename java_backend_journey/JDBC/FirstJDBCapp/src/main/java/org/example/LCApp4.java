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

            String sql =  "Select * from student";
               pstmnt =   connect.prepareStatement(sql);
//          System.out.println("Enter the Student data:");
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the id:");
//          int id =sc.nextInt();
//            System.out.println("Enter the name:");
//            String name =sc.next();
//            System.out.println("Enter the age:");
//            int age =sc.nextInt();
//            System.out.println("Enter the city:");
//            String city =sc.next();
//            pstmnt.setInt(1,id);
//            pstmnt.setString(2,name);
//            pstmnt.setInt(3,age);
//            pstmnt.setString(4,city);

           ResultSet  rs = pstmnt.executeQuery();
          while(rs.next()){
               System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+ rs.getString(4));

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
