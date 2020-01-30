public class Roll extends Navi
{
    @Override
    public void generate()
    {
        System.out.println("Roll.exe, Jack in!");
    }

    @Override
    public void attack()
    {
        System.out.println("Heal!");
    }

    @Override
    public void move()
    {
        System.out.println("Teleport!");
    }
}