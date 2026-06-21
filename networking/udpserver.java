import java.net.*;

public class udpserver {
    public static void main(String[] args)throws Exception {

        DatagramSocket ds =new DatagramSocket(5000);
        byte[] buffer =new byte[1024];
        DatagramPacket dp =new DatagramPacket(buffer,buffer.length);
        ds.receive(dp);
        String msg = new String(dp.getData());
        System.out.println(msg);
        ds.close();
    }
}