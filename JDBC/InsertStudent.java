import java.sql.*;
public class InsertStudent {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/college";
            Connection con = DriverManager.getConnection(url, "root", "");
            String sql = "INSERT INTO student VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setString(2, "Rajeev");
            ps.setString(3, "Computer Engineering");
            int rows = ps.executeUpdate();
            System.out.println(rows + " Record Inserted Successfully");
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}