import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplement extends UnicastRemoteObject implements RemoteInterface
{
    public ServerImplement() throws RemoteException
    {
        super();
    }
    public int add(int x,int y)
    {
        return (x+y);
    }
}