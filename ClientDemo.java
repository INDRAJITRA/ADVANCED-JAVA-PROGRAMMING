import java.net.*;
import java.io.*;
class ClientDemo
{
  public static void main(String arg[])throws Exception 
  {
    Socket s=new Socket("localHost",3333);
	System.out.println("\n connected....");
	
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	
	System.out.println("\n Received....");
	
	
	br.close();
	s.close();
  }
}