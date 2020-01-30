public class NaviStatus implements Observer // Concrete Monitor : OBSERVER
{
    Style style = null;
    public NaviStatus(Style newStyle)
    {
        style = newStyle;
    }

    public void Update(Subject o)
    {
        System.out.println(style.getName() + " Updated!");
    }
}