package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Single value Annotation...
@Retention(RetentionPolicy.RUNTIME)
public @interface copyright 
{
    String value();
}