package Duck;

public class PigeonAdapter implements Quackable{
    Pigeon pigeon = new Pigeon();
    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }
    @Override
    public void quack() {
            pigeon.coo();
            pigeon.coo();
    }
}
