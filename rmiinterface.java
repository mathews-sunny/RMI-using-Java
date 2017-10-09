import java.rmi.*;
public interface rmiinterface extends Remote
	{
	 int multiply(int x,int y) throws RemoteException;
	}
