public class AgeValidator implements Validator{

    public void AgeValidator() {

    }


    public void validate(User user) {
        if( user.getAge() < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
    }
}
