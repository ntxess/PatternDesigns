import java.util.Random;

public class VirusFactory implements EnemyFactory {
    @Override
    public Entity createEnemy()
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        if (rand_int % 3 == 0)
            return new Canodumb();
        else if (rand_int % 3 == 1)
            return new Canodumb2();
        else if (rand_int % 3 == 2)
            return new Mettuar();
        else return null;
    }
}
