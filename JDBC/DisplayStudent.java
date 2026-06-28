import java.sql.*;
public class DisplayStudent {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/college";
            Connection con = DriverManager.getConnection(url, "root", "");
            String sql = "SELECT * FROM student";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println("ID\tNAME\t\tFACULTY");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "\t"
                                + rs.getString("name") + "\t"
                                + rs.getString("faculty"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}