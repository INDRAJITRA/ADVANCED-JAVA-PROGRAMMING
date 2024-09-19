
// program for chatting between server and client 


import java.net.*;
import java.io.*;
class myServerChatDemo
{
  public static void main(String arg[])throws Exception 
  {
  
    DataOutputStream dout;
    DataInputStream din;
    String str;  
	BufferedReader br;
	
    ServerSocket ss=new ServerSocket(4444);
	Socket s=ss.accept();
	System.out.println("\n connected....");
	
	do{
	   
        System.out.println("\n Server :- ");	
        br=new BufferedReader(new InputStreamReader(System.in));
        str=br.readLine();
        dout=new DataOutputStream(s.getOutputStream());
        dout.writeUTF(str);
        din=new DataInputStream(s.getInputStream());
        System.out.println("\n Client :- "+din.readUTF());		
		
	  }while(!str.equals("Bye"));
	dout.close();
	s.close();
	ss.close();
  }
}