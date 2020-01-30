// Concrete Creator

import java.util.Random;

public class FriendFactory implements EntityFactory {
    public Entity createNavi() {
        return new Megaman();
    }

    public Entity createVirus() {
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        if (rand_int % 2 == 0)
            return new Scuttle();
        else if (rand_int % 2 == 1)
            return new Scutz();
        else return null;
    }
}
