package Validator;

import Entity.User;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import javax.validation.Validator;


@Component
public class UserValidator implements Validator {
    @Autowired
    private UserService userService;

    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }



    public void validate(Object o, Errors errors) {
        User user = (User) o;
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");

   }
}
