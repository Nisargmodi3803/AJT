package StreamProcessing;

import java.util.*;

public class Map2
{
    public static void main(String[] args)
    {
        List<String> vehicles = Arrays.asList("Bus","Car","Bike","Truck","Scooty","Flight","Train");

        vehicles
                .stream()
                .map(vname->vname.length())
                .forEach(System.out::println);
    }
}
