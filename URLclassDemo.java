import java.net.*;
class URLclassDemo
{
    public static void main(String arg[])throws Exception 
  {
     
   URL u=new URL("https://support.google.com/google-ads/answer/14095?hl=en");
   System.out.print("\n Protocol:- "+u.getProtocol());
   System.out.print("\n Host:- "+u.getHost());
   System.out.print("\n Port:- "+u.getPort());
   System.out.print("\n File:- "+u.getFile());
   System.out.print("\n External form:- "+u.toExternalForm());

  }
}