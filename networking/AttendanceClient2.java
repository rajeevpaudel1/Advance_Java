import java.io.*;
import java.net.*;

public class AttendanceClient2 {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            System.out.print("Enter Your Name: ");

            String name = keyboard.readLine();

            pw.println(name);

            System.out.println("Attendance Submitted!");

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}