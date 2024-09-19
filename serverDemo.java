import java.net.*;
import java.io.*;
class serverDemo
{
  public static void main(String arg[])throws Exception 
  {
    ServerSocket ss=new ServerSocket(3333);
	Socket s=ss.accept();
	System.out.println("\n connected....");
	
	PrintWriter p=new PrintWriter(s.getOutputStream(),true);
	p.write("HII I AM A SERVER...");
	p.close();
	s.close();
	ss.close();
  }
}