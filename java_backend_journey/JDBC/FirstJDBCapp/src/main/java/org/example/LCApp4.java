package org.example;
import java.sql.*;
import java.sql.DriverManager;

public class LCApp4 {
    public static void main(String[] args) {
        JdbcUtil.loadDriver();
        Connection connect = null;
        Statement statement = null;
        ResultSet rs = null;
        try{
            connect = JdbcUtil.getConnect();
            statement = connect.createStatement();

            String sql =  "SELECT * FROM student WHERE id = 2";
            rs = statement.executeQuery(sql);
            while(rs.next()){
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getInt(3) + " " +
                                rs.getString(4));
            }
        }
        catch (SQLException e) {

            e.printStackTrace();

        } finally {

            JdbcUtil.close(rs);
            JdbcUtil.close(statement);
            JdbcUtil.close(connect);
        }
    }
}
