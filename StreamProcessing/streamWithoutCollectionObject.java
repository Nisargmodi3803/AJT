package StreamProcessing;

import java.util.stream.Stream;

public class streamWithoutCollectionObject
{
    public static void main(String[] args)
    {
        Stream.of("Gujarat","Goa")
                .findFirst()
                .ifPresent(System.out::println);

    }
}
