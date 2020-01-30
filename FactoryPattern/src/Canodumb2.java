public class Canodumb2 extends Virus // Concrete Product
{
    public Canodumb2()
    {
        setName("Canodumb2");
        setHP(90);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " is attacking with its Cannon!");
    }
}