import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbcprep {
    public static void main(String[] args) {
        Class.forName(null);
        Connection con= DriverManager.getConnection(null, null, null);
        
        String Sql="Insert into student values(?,?,?)";

        PreparedStatement stmt=con.prepareStatement(Sql);
        
        for(int i=0;i<1-;i++){
            String name="ekjot";
            int roll=12;
            String sex="M";
            
            stmt.setString(1,name);
            stmt.setInt(2,roll);
            stmt.setString(3,sex);
            stmt.execute();}

    }
}
