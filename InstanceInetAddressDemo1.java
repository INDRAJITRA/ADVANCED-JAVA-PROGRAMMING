import java.net.*;
class InstanceInetAddressDemo1

{/*start of InstanceInetAddressDemo1 class*/

  // using main method 
 public static void main(String arg[]) throws UnknownHostException
 {//starting of main method 
  
  InetAddress a = InetAddress.getLocalHost();//return local host name 
   System.out.println(" Name "+a.getHostName());//return  host name
   System.out.println(" Address "+a.getHostAddress());//return local host Address
   System.out.println(" Multicast "+a.isMulticastAddress());//return Address is multicast or not 
  
  }/*end of main method*/
  
}//end of InstanceInetAddressDemo class