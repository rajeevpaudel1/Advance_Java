import java.io.*;
import java.net.*;

public class AttendanceServer2 {

    public static void main(String[] args) {

        try {

            ServerSocket server = new ServerSocket(5000);

            System.out.println("===================================");
            System.out.println("  ATTENDANCE SERVER STARTED");
            System.out.println("  Listening on Port 5000");
            System.out.println("===================================");

            int attendanceCount = 0;

            while (true) {

                System.out.println("\nWaiting for Student...");

                Socket socket = server.accept();

                attendanceCount++;

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String studentName = br.readLine();

                System.out.println("--------------------------------");
                System.out.println("Attendance #" + attendanceCount);
                System.out.println("Student: " + studentName);
                System.out.println("IP Address: " + socket.getInetAddress());
                System.out.println("Time: " + new java.util.Date());
                System.out.println("--------------------------------");

                socket.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}