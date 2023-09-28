package StreamProcessing;

import java.util.Arrays;
import java.util.List;

public class Map3
{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(1,2,3,4,5);

        num
                .stream()
                .map(n->n*3)
                .forEach(System.out::println);
    }
}
