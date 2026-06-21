import java.io.*;
import java.net.*;

public class TCPClient2 {
    public static void main(String[] args) throws Exception {

        // Connect to server
        Socket socket = new Socket("localhost", 5000);

        // Send message to server
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

        pw.println("Hello Server, I am the Client.");

        // Receive reply from server
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String serverReply = br.readLine();

        System.out.println("Server says: " + serverReply);

        // Close connection
        socket.close();
    }
}