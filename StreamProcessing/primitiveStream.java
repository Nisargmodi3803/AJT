package StreamProcessing;

import java.util.Arrays;
import java.util.stream.IntStream;

public class primitiveStream
{
    public static void main(String[] args) {
        IntStream.range(1,10)
                .average()
                .ifPresent(System.out::println);

        Arrays.stream(new int[] {101,102,103,105,110,120})
                .average()
                .ifPresent(System.out::println);
    }
}
