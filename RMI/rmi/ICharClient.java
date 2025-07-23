public class IChatClient {
    public static void main(String[] args) {
        try {
            IChatClient chatRemote = (IChatRemote) java.rmi.Naming.lookup("rmi://localhost/ChatRemote");
          	deliverMsg(String hi);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
