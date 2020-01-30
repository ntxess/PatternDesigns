// Concrete Creator

import java.util.Random;

public class FoeFactory implements EntityFactory {
    public Entity createNavi() {
        return new Bass();
    }

    public Entity createVirus() {
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        if (rand_int % 2 == 0)
            return new Canodumb();
        else if (rand_int % 2 == 1)
            return new Mettuar();
        else return null;
    }
}
