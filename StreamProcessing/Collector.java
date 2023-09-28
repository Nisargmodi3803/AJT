package StreamProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collector
{
    public static void main(String[] args) {
        List<String> states = Arrays.asList("Assam","Gujarat","Goa","Rajasthan","Punjab");
        List<String> ans = states
                                    .stream()
                                    .filter(s->s.startsWith("G"))
                                    .collect(Collectors.toList());
        System.out.println(ans);
    }

}
