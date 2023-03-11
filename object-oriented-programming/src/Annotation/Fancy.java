package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Fancy {
    
    // kalau pakai default maka artinya tidak wajib diisi
    // String name() default "";
    String name();

    String[] tags() default{};

}
