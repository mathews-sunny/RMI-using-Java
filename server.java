import java.rmi.*;
import java.rmi.server.*;
public class server extends UnicastRemoteObject implements rmiinterface
	{
	 public server() throws RemoteException
		{}
	 public static void main(String args[]) throws Exception
		{
		 System.out.println("in server");
		 server s= new server();
		 Naming.rebind("server",s);
		 }
	public int multiply(int x1,int y1)
		{
		 return x1*y1;
		 }
	 }
