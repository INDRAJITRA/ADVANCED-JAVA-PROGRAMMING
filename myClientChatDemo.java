
// program for chatting between server and client 


import java.net.*;
import java.io.*;
class myClientChatDemo
{
  public static void main(String arg[])throws Exception 
  {
  
    DataOutputStream dout;
    DataInputStream din;
    String str,s1;  
	BufferedReader br;
	
	Socket s=new Socket("172.17.12.71",6666);
	System.out.println("\n connected....");
	
	do{
	   
	   din=new DataInputStream(s.getInputStream());
       s1=din.readUTF();
	   System.out.println("\n Server :- "+s1);
	   dout=new DataOutputStream(s.getOutputStream());
       br=new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("\n Client :- ");
       str=br.readLine();
       dout.writeUTF(str);
     
	  }while(!str.equals("Bye"));
	  
	 din.close();
	 dout.close();
	 s.close();
	
  }
}