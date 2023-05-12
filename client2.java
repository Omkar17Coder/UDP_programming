import java.io.*;
import java.net.*;




public class client2{

    public static void main(String args[]) {
    try{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    DatagramSocket ds=new DatagramSocket();
    String s=br.readLine();
   byte [] b=s.getBytes();
   InetAddress ia=InetAddress.getLocalHost();
   DatagramPacket dp1=new DatagramPacket(b, b.length,ia,9999);
   ds.send(dp1);

   System.out.println("Sent message wait for resposne");
   
   byte [] b1=new byte[1024];
   DatagramPacket dp2=new DatagramPacket(b1,b1.length);
   ds.receive(dp2);
   
   String reply=new String(dp2.getData());

   System.out.println("Reply:"+reply);

ds.close();

}
    catch(Exception e){

    }

        
    }
}