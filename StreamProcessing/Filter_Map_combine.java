package StreamProcessing;

import java.util.Arrays;
import java.util.List;

class Employee
{
    public int id;
    public String name;
    public int Salary;

    public Employee(int id,String name,int salary)
    {
        this.id = id;
        this.name = name;
        this.Salary = salary;
    }
}

public class Filter_Map_combine
{
    public static void main(String[] args)
    {
        List<Employee> Emp = Arrays.asList(
                new Employee(1,"Bray Wyatt",50000),
                new Employee(2,"Roman Reigns",40000),
                new Employee(3,"Seth Rollins",30000),
                new Employee(4,"Kevin Ownes",20000),
                new Employee(5,"Sami Zyan",10000)
        );

        Emp
                .stream()
                .filter(e->e.Salary>20000)
                .map(e->e.name)
                .forEach(System.out::println);
    }
}
