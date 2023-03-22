import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcprac3 {
    public static void main(String[] args) {
        
        Class.ForName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getconnection(url,uname,pswd);
        
        String sql="insert into student values(?,?,?);";
        PreparedStatement stmt=con.prepareStatement(null); //not createstatment
                
        String name="ekjot";
        int roll=12;
        String sex="M";
        stmt.setString(1, name);

    }
}
