package util;

import data.LoginRequest;
import error.ValidationEception;
import java.lang.NullPointerException;

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
}
