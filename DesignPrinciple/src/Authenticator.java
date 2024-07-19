import java.util.List;
// Nakorn Boonprasong 6510405458

public class Authenticator {

    public void Authenticator() {

    }

    public boolean register(User user, List<Validator> validators) {
        for (Validator validator : validators) {
            validator.validate(user);
        }
        return true;
    }

}
