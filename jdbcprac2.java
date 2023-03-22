import java.sql.Connection;
import java.sql.DriverManager;
public class jdbcprac2 {
    public static void main(String[] args) {
        Class.ForName("com.mysql.jdbc.Driver");
        String url,name,pswd;
        Connection con=DriverManager.getConnection(url,name,pswd);
        
        Statement stmt=con.createStatement();
        stmt.executeUpdate("query"); //insert,update,delete

        ResultSet rs=stmt.executeQuery("select * from student;");
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        stmt.close();
        con.close();
    }
}
