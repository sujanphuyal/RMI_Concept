import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class server {
    public static void main(String[] args) {
        try{
            ServerImplement s=new ServerImplement();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi:///RemoteInterface",s);
            System.out.println("Server Started ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
