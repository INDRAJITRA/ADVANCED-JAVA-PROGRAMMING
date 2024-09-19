import java.net.*;

class UDPReceiverDemo
{
  public static void main(String arg[])throws Exception 
  {
    DatagramSocket ds=new DatagramSocket(3000);
	byte[] buffer=new byte[1024];//size
	DatagramPacket dp=new DatagramPacket(buffer,1024);
	ds.receive(dp);
	String str=new String(dp.getData(),0/*start from zero index*/,dp.getLength());
	System.out.println(str);
	ds.close();
  }
}