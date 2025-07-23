public interface IChatRemote extends java.rmi.Remote
{
    public connect("eash", ChatClientObject) throws java.rmi.RemoteException;
    public send("eash", "hello") throws java.rmi.RemoteException;
    public listall();//list of users connected
}
