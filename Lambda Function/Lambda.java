@FunctionalInterface
interface Lambda_Interface
{
    public void display();
}

public class Lambda 
{
    public static void main(String[] args) 
    {
        Lambda_Interface i = ()->{
            System.out.println("This is Lambda Function");
        };
        i.display();
    }
}
