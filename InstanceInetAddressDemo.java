import java.net.*;
class InstanceInetAddressDemo

{/*start of InstanceInetAddressDemo class*/

  // using main method 
 public static void main(String arg[]) 
 {//starting of main method 
 
  try
  {//starting of try block
  
  InetAddress a = InetAddress.getLocalHost();//return local host name 
   System.out.println(" Name "+a.getHostName());//return  host name
   System.out.println(" Address "+a.getHostAddress());//return local host Address
   System.out.println(" Multicast "+a.isMulticastAddress());//return Address is multicast or not 
   
  /*end of try block*/}
 
  catch(UnknownHostException e)
  {/*starting of catch block*/
	 System.out.println(e);
  /*ending of catch  block*/}
  }/*end of main method*/
  
}//end of InstanceInetAddressDemo class