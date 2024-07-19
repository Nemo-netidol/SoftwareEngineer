// Nakorn Boonprasong 6510405458

public class NameValidator implements Validator{

    public NameValidator() {

    }

    public void validate(User user) {
        if (user.getName() == null || user.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
        if ( !user.getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
    }
}
