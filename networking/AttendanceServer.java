import java.io.*;
import java.net.*;

public class AttendanceServer {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(5000);

            System.out.println("================================");
            System.out.println(" Attendance Server Started");
            System.out.println(" Waiting for Student...");
            System.out.println("================================");

            Socket socket = server.accept();

            System.out.println("Student Connected!");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String studentName = br.readLine();

            System.out.println();
            System.out.println("Attendance Received");
            System.out.println("---------------------");
            System.out.println("Student Name: " + studentName);

            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}