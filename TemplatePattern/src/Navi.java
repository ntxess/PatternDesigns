public abstract class Navi
{
    public final void executeCommand()
    {
        generate();
        attack();
        move();
    }

    abstract void generate();
    abstract void attack();
    abstract void move();
}