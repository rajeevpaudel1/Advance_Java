import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(5000);

        System.out.println("Waiting for Client...");

        Socket socket = server.accept();

        System.out.println("Client Connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg = br.readLine();

        System.out.println("Received: " + msg);

        socket.close();
        server.close();
    }
}