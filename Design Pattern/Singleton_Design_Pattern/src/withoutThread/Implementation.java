package withoutThread;

public class Implementation
{
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        System.out.println(l1.hashCode());

        Logger l2 = Logger.getInstance();
        System.out.println(l2.hashCode());
    }
}
