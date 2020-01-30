public class NaviAdapter implements Entity // Adapter
{
    Navi netNavi;
    public NaviAdapter(Navi netNavi)
    {
        this.netNavi = netNavi;
    }

    public void attack()
    {
        netNavi.useChip();
    }

    public void move()
    {
        netNavi.move();
    }
}