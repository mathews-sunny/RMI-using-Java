import java.rmi.*;
import java.io.*;
import java.net.*;
public class client
	{
	 public static void main(String args[]) throws Exception
		{
		 rmiinterface m=(rmiinterface)Naming.lookup("rmi://localhost/server");
		 int a=Integer.parseInt(args[0]);
		 System.out.println("Unit price : "+args[1]);
		 int b=Integer.parseInt(args[1]);
		 System.out.println("The total is "+m.multiply(a,b));
		 }
	 }
