public class Canodumb extends Virus {
    public Canodumb() {
        setName("Canodumb");
        setHP(60);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with its Cannon!");
    }
}