import java.util.HashSet;
import java.util.Set;

public class Hash_set 
{
    public static void main(String[] args) 
    {
        Set<Integer> s = new HashSet<>();
        System.out.println("Element entered : "+s.add(25));
        s.add(45);
        s.add(2);
        s.add(2);

        System.out.println(s);
    }    
}
