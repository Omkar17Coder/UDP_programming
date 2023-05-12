import java.io.*;
import java.net.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;


public class server2{

    public static void main(String args[]){
        try{
  DatagramSocket ds=new DatagramSocket(9999);
  byte[] b1=new byte[1024];
DatagramPacket dp1=new DatagramPacket(b1,b1.length);
ds.receive(dp1);

String revc=new String(dp1.getData());
System.out.println(revc);


revc=revc+"Hello!!";

byte [] b2=revc.getBytes();
InetAddress ia=InetAddress.getLocalHost();
DatagramPacket ds2=new DatagramPacket(b2,b2.length,ia,dp1.getPort());
ds.send(dp1);

System.out.println("Sent the data Bye:!");
ds.close();


        }
        catch(Exception e){
            System.out.println("Something wrong");

        }
    }
}