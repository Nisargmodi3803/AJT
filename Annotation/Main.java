package Annotation;

import Annotation.initial;
import Annotation.copyright;
import Annotation.Author;

@initial
@copyright(value = "DDU,2023")
@Author(FirstName = "Nisarg", LastName = "Modi")
public class Main {
    public static void main(String[] args)
        {
            System.out.println("Initial Annotation present : "+Main.class.isAnnotationPresent(initial.class));
            String value = main.class.getAnnotations(copyright.class).value();
            System.out.println("Copyright Annotation's Value : "+value);
        }
}
