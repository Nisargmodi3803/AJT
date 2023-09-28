package StreamProcessing;

import java.util.ArrayList;
import java.util.List;

class product
{
    public int id;
    public String name;
    public double price;

    public product(int id,String name,double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
public class FilterDemoUsingClassObject
{
    public static void main(String[] args) {
        List<product> pr = new ArrayList<>();

        pr.add(new product(1,"Dell Laptop",75000));
        pr.add(new product(2,"HP Laptop",48000));
        pr.add(new product(3,"Lenovo Laptop",35000));
        pr.add(new product(4,"Asus Laptop",55000));
        pr.add(new product(5,"MacBook",85000));

        pr
                .stream()
                .filter(p->p.price>50000)
                .forEach(p->System.out.println(p.price));
    }
}
