import java.rmi.server.UnicastRemoteObject;

public class IChatServer {
    public static void main(String[] args) {
        try {
            
            ChatRemote chatRemote = new ChatRemote();
            IChatRemote stub =(ChatRemote)UnicastRemoteObject.exportObject(chatRemote, 0);
            java.rmi.Naming.rebind("chatRemote", stub);
            System.out.println("Server is ready.");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
