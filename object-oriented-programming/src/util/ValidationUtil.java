package util;

import java.lang.reflect.Field;

import Annotation.NotBlank;
import data.LoginRequest;
import error.BlankEception;
import error.ValidationEception;

public class ValidationUtil extends Throwable{

    public static void validate(LoginRequest loginRequest) throws ValidationEception,NullPointerException{
        if(loginRequest.name() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.name().isBlank()){
            throw new ValidationEception("Username is blank");
        }else if(loginRequest.password().isBlank()){
            throw new NullPointerException("password is null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationEception("password is blank");
        }
    }
 
    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.name() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.name().isBlank()){
            throw new BlankEception("Username is blank");
        }else if(loginRequest.password().isBlank()){
            throw new NullPointerException("password is null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankEception("password is blank");
        }
    }

    public static void validationReflection(Object o){
        Field[] fields = o.getClass().getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);
            if(field.getAnnotation(NotBlank.class) != null){
                // validated
                try {
                    String value = (String) field.get(o);

                    if(value == null || value.isBlank() ){
                        throw new BlankEception("Field : "+ field.getName()+" is Blank");
                    }
                }
                catch (IllegalAccessException err) {
                    System.out.println("Cannot Access fied : "+ field.getName());
                }
            }
        }

    }

}
