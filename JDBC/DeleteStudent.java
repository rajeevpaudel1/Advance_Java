import java.sql.*;
import java.util.Scanner;
public class DeleteStudent {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            Connection con = DriverManager.getConnection(url, "root", "");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student ID : ");
            int id = sc.nextInt();
            String sql = "DELETE FROM student WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Record Deleted Successfully");
            } else {
                System.out.println("Student Not Found");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}