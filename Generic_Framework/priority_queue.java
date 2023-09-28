import java.util.*;

public class priority_queue 
{
    public static void main(String[] args) 
    {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(45);
        q.add(14);
        q.add(02);
        q.add(25);
        System.out.println(q);  
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());//to check which element will be next remove.

        Queue<String> q1 = new PriorityQueue<>();
        q1.add("Moon");
        q1.add("Sun");
        System.out.println(q1);

        
    }    
}
