import java.util.*;

public class IteratorUsingHashMap
{
    public static void main(String[] args) 
    {
        Map<Integer,String> m = new HashMap<>();
        m.put(1, "Nisarg");
        m.put(2,"Ayush");

        Collection<String> students = m.values(); // Using Values....
        for(String st : students)
        {
            System.out.println("StudentName = "+st);
        }

        Collection<Integer> Ids = m.keySet();
        for(Integer id : Ids)
        {
            System.out.println("StudentID = "+id);
        } 
    }  
}
