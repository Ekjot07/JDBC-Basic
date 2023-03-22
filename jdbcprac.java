import java.sql.*;
import java.util.*;
class jdbcprac{
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(null, null, null);
            //conn succesfull
            
            //insert
            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate("insert into student values('ekjot',123);"); //insert, update, delete
            
            //after insertion

            ResultSet rs=stmmt.executeQuery("select * from student"); //select
            while(rs.next()){
                String s=rs.getString(1)+""+rs.getString(2);
                System.out.println(s);
            }
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }



    }