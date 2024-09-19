import java.net.*;

class UDPSenderDemo	
{
  public static void main(String arg[])throws Exception 
  {
    DatagramSocket ds=new DatagramSocket(3000);
	String str="Welcome in AJP";
	InetAddress ip=InetAddress.getByName("127.0.0.1");
	DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
	ds.send(dp);
	ds.close();
  }
}