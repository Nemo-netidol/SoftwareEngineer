import java.util.Arrays;
import java.util.List;
// Nakorn Boonprasong 6510405458
public class Main {
    public static void main(String[] args) {

        User user = new User("March", "March@dom1.cc", 20);
        NameValidator nameValidator = new NameValidator();
        EmailValidator emailValidator = new EmailValidator();
        AgeValidator ageValidator = new AgeValidator();

        List<Validator> validators = Arrays.asList(nameValidator, emailValidator, ageValidator);

        Authenticator authenticator = new Authenticator();

        authenticator.register(user, validators);

    }
}