import java.rmi.Naming;

public class client {
    public static void main(String[] args) throws Exception {
            String ip="rmi://localhost/RemoteInterface";
            RemoteInterface s=
                    (RemoteInterface)Naming.lookup(ip);
            System.out.println("sum: "+ s.add(1,3));
    }
}
