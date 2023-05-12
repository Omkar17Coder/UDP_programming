import java.io.*;
import java.net.*;

public class server1{


    public static void main(String args[]){
      
   try{
        DatagramSocket ds=new DatagramSocket(9999);
          

        byte [] b=new byte[1024];

        DatagramPacket dp1=new DatagramPacket(b, b.length);
        ds.receive(dp1);
        System.out.println("Recieved Data");
        String str=new String(dp1.getData());

        String newStr="This is Just Start " +str+ " This is closing";
         

        byte[] b2=newStr.getBytes();
         InetAddress ia=InetAddress.getLocalHost();
        DatagramPacket dp2=new DatagramPacket(b2,b2.length,ia,dp1.getPort());
         ds.send(dp2);
         System.out.println("Send Data Bye:");
         ds.close();

   }

   catch(Exception e){
    System.out.println("error");
   }
    }
}