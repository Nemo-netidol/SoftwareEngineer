package Duck;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    public List<Quackable> flock = new ArrayList<>();

    public void add(Quackable duck) {
        flock.add(duck);
    }

    @Override
    public void quack() {
        int count = 0;
        for (Quackable duck: flock) {
            if (count < 1) {
                duck.quack();
                duck.quack();
                duck.quack();
                count++;
            }
            else {
                duck.quack();
            }

        }
    }
}
