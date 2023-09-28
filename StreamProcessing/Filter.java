package StreamProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter
{
    public static void main(String[] args)
    {
        List<Integer> arr = Arrays.asList(10,15,20,30,35,45,40);

        //Without Stream processing...

        List<Integer> arr_mod_2 = new ArrayList<>();

        for(int num : arr)
        {
            if(num%2==0)
                arr_mod_2.add(num);
        }

        System.out.println("Without Stream Processing...");
        System.out.println(arr_mod_2);

        //With Stream processing...
        System.out.println();
        System.out.println("With Stream Processing...");
        arr
                .stream()
                .filter(n->n%2==0)
//                .forEach(n->System.out.println(n)); //Instead of this use below statment
                .forEach(System.out::println);

        List<String> list = Arrays.asList("Melienda","Jon","Sansa","Daenerys","Joffery");

        list
                .stream()
                .filter(str->str.length()>6 && str.length()<8)
                .forEach(System.out::println);
    }
}
