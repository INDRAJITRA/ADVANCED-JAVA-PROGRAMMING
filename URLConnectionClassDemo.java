import java.net.*;
import java.util.*;
import java.io.*;

class URLConnectionClassDemo
{
    public static void main(String arg[])throws Exception 
  {
     
   URL u=new URL("https://support.google.com/google-ads/answer/14095?hl=en");
   URLConnection uc=u.openConnection();
   System.out.print("\n Content-type:- "+uc.getContentType());
   System.out.print("\n Content-Encoding:- "+uc.getContentEncoding());
   System.out.print("\n Date:- "+new Date(uc.getDate()));
   System.out.print("\n Last Modified :- "+new Date(uc.getLastModified()));
   System.out.print("\n Expiration Date:- "+new Date(uc.getExpiration()));
   System.out.print("\n Content Length:- "+uc.getContentLength());
   
  }
}