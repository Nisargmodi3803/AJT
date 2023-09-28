package StreamProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map1
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Gujarat","Tamil Nadu","Rajasthan","Punjab");

        //Without Stream Processing...
        System.out.println("Without Stream Processing");
        List<String> uppercaseName = new ArrayList<>();
        for(String name : names)
        {
            uppercaseName.add(name.toUpperCase());
        }
        System.out.println(uppercaseName);

        System.out.println();
        //With Stream Processing...
        System.out.println("With Stream Processing");
        names
             .stream()
             .map(name->name.toUpperCase())
             .forEach(System.out::println);
    }
}
