package lambda_function_default;

@FunctionalInterface
interface operation
{
    float op(float n1,float n2);
    default void method()
    {
        System.out.println("Default method executed");
    }
}
public class lambda_function_default
{
    public static void main(String[] args) {
        // TODO code application logic here
        operation add = (n1,n2) -> {
            return (n1+n1);
        };
        
        operation sub = (n1,n2) -> {
            return (n1-n2);
        };
        
        operation mul = (n1,n2) -> {
            return(n1*n2);
        };
        
        operation div = (n1,n2) -> {
            return (n1/n2);
        };
        
        System.out.println("Addition = "+add.op(10, 5));
        System.out.println("Subtration = "+sub.op(10, 5));
        System.out.println("Multiplication = "+mul.op(10, 5));
        System.out.println("Division = "+div.op(10, 5));
        add.method();
    }
    
}
