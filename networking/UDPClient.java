import java.net.*;

public class UDPClient {
    public static void main(String[] args)throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] msg = "Hello UDP".getBytes();
        DatagramPacket dp = new DatagramPacket(msg, msg.length,
                InetAddress.getByName("localhost"),5000);
        ds.send(dp);
        ds.close();
    }
}