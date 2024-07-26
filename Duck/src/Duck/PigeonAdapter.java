package Duck;
//Nakorn Boonprasong 6510405458

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
