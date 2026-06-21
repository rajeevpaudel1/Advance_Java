import java.io.*;
import java.net.*;

public class TCPServer2 {
    public static void main(String[] args) throws Exception {

        // Create server socket
        ServerSocket server = new ServerSocket(5000);

        System.out.println("Server is waiting for client...");

        // Accept client connection
        Socket socket = server.accept();

        System.out.println("Client Connected!");

        // Receive message from client
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String clientMessage = br.readLine();

        System.out.println("Client says: " + clientMessage);

        // Send reply to client
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

        pw.println("Hello Client, message received successfully!");

        // Close connections
        socket.close();
        server.close();
    }
}