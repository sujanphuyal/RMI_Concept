import java.rmi.Naming;
public class client {
    public static void main(String[] args) throws Exception {
        RemoteInterface s= (RemoteInterface)Naming.lookup("RemoteInterface");
        System.out.println("sum: "+ s.add(1,3));
    }
}
