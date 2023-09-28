import java.util.*;

class Hash_map
{
    public static void main(String[] args) 
    {
        Map<Integer,String> m = new HashMap<>();

        m.put(1,"Nisarg");
        m.put(2,"Ayush");

        // System.out.println(m);
        // System.out.println();

        // for(int key : m.keySet())
        // {
        //     System.out.println(key+" : "+m.get(key));
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id whose name you want : ");
        int id = sc.nextInt();

        // System.out.println("Id="+id+" Name="+m.get(id).toUpperCase());
        if(m.get(id)!=null)
        {
            System.out.println("Id="+id+" Name="+m.get(id));
        }
        else
        {
            System.out.println("Id doesnot exist");
        }

        sc.close();
    }
}