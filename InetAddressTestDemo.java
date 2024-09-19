import java.net.*;
class InetAddressTestDemo

{//start of InetAddressTestDemo class 

  // using main class 
 public static void main(String arg[]) 
 
 {//starting of main method 
	 
 try{//starting of try block
  
  InetAddress a=InetAddress.getLocalHost();
  System.out.println(a);
  //return local host name 
  
   a=InetAddress.getByName("www.thecodehelp.com");
  System.out.println("/n"+a);
  //return ip of given website

  InetAddress sw[]=InetAddress.getAllByName("www.stackoverflow.com");
  for(int i=0;i<sw.length;i++)
  {//starting of for loop
  
   System.out.println("\n"+sw[i]);
   // return multiple host servers ip
  /*end of for loop*/}
  
   /*end of try block*/}
 
  catch(Exception e)
  {/*starting of catch block*/
	 
  /*ending of catch  block*/}
  
 
 /*end of main method*/}
 
}//end of InetAddressTestDemo class