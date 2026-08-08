package org.example;
import java.sql.*;
import java.sql.DriverManager;
import java.util.*;
public class LCApp5 {
    public static void main(String[] args) {
        JdbcUtil.loadDriver();
        Connection connect = null;
        PreparedStatement pstmnt = null;
        try {
                connect = JdbcUtil.getConnect();
                String query = "Update student set age=? where id=?";

                pstmnt = connect.prepareStatement(query);

                // Using Batch update
                pstmnt.setInt(1,21);
                pstmnt.setInt(2,1);
                pstmnt.addBatch();
               pstmnt.setInt(1,18);
                pstmnt.setInt(2,2);
                 pstmnt.addBatch();
            pstmnt.setInt(1,29);
            pstmnt.setInt(2,3);
            pstmnt.addBatch();






//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter the info of a sutdent: id");
//                int id = sc.nextInt();
//                System.out.println("Enter the age to be updated");
//                int age = sc.nextInt();
//                pstmnt.setInt(1,age);
//                pstmnt.setInt(2,id);
                 pstmnt.executeBatch();
               System.out.println("Check the, db table to see the result");
//               if(row == 0){
//                   System.out.println("Operation failed");
//               }
//               else{
//                   System.out.println("Operation Succesfull");
//               }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            JdbcUtil.close(connect );
        }


    }
}
