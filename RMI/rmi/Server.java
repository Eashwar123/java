import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) {
        try {
            
            MathRemote mathRemote = new MathRemote();
            IMathRemote stub =(MathRemote)UnicastRemoteObject.exportObject(mathRemote, 0);
            java.rmi.Naming.rebind("MathRemote", stub);
            System.out.println("Server is ready.");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
