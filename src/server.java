import java.rmi.Naming;
public class server {
    public static void main(String[] args) throws Exception{
        ServerImplement s=new ServerImplement();
        Naming.rebind("RemoteInterface",s);
        System.out.println("Server Started ");
    }
}