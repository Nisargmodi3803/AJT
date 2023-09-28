package NetworkConnection;

public class Main
{
    public static void main(String[] args) throws InterruptedException,CloneNotSupportedException {
        NetworkConnection nc = new NetworkConnection();
        System.out.println("First Time");
        nc.setip("192.168.4.1");
        nc.loadImportantMsg("This is very Important Message");
        System.out.println(nc);

        System.out.println("Second Time");
        NetworkConnection nc2 = (NetworkConnection) nc.clone();
        System.out.println(nc2);
    }
}
