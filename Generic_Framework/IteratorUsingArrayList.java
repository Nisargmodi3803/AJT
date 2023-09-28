import java.util.*;

class Student
{
    private int StId;
    private String stName;

    public Student(int id,String name)
    {
        this.StId = id;
        this.stName = name;
    }
    public void setStId(int stId) 
    {
        StId = stId;
    }

    public void setStName(String stName) 
    {
        this.stName = stName;
    }

    public int getStId() 
    {
        return StId;
    }

    public String getStName() 
    {
        return stName;
    }
}

public class IteratorUsingArrayList 
{
    public static void main(String[] args) 
    {
        List<Student> st = new ArrayList<>();
        st.add(new Student(1, "Nisarg"));
        st.add(new Student(2, "Ayush"));
        st.add(new Student(3, "Aryan"));

        Iterator<Student> iterator = st.iterator();//Iterator Delaration.
        Student stud;

        //Using hasNext() method....
        while(iterator.hasNext())
        {
            stud = iterator.next();
            System.out.println("Id = "+stud.getStId()+" Name = "+stud.getStName());
        }

        //Using ForEach Loop....
        for(Student stud1 : st)
        {
            System.out.println("Id = "+stud1.getStId()+" Name = "+stud1.getStName());
        }
    }    
}
