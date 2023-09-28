package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//MultiValue Annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Author 
{
    String FirstName();
    String LastName();
}