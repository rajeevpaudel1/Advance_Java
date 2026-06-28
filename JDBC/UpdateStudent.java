import java.sql.*;
import java.util.Scanner;
public class UpdateStudent {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            Connection con = DriverManager.getConnection(url, "root", "");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter New Name : ");
            String name = sc.nextLine();
            System.out.print("Enter New Faculty : ");
            String faculty = sc.nextLine();
            String sql = "UPDATE student SET name=?, faculty=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, faculty);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Record Updated Successfully");
            } else {
                System.out.println("Student Not Found");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}