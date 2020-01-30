public class Mettuar extends Virus {
    public Mettuar()
    {
        setName("Mettuar");
        setHP(40);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with its Pick-Axe!");
    }
}
