import java.rmi.Naming;

public class client
{
    public static void main(String args[])
    {
        try
        {
            String ip="rmi://localhost/RemoteInterface";
            RemoteInterface s=
                    (RemoteInterface)Naming.lookup(ip);
            System.out.println("sum: "+ s.add(1,3));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
