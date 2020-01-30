public class Megaman extends Navi
{
    @Override
    public void generate()
    {
        System.out.println("Megaman.exe, Jack in!");
    }

    @Override
    public void attack()
    {
        System.out.println("Charged Shot!");
    }

    @Override
    public void move()
    {
        System.out.println("Area Grab!");
    }
}