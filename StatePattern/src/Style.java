public class Style // Context
{
    private StyleState currentState;
    private String name;
    public Style(String n)
    {
        name = n;
        currentState = NormalStyle.getInst();
    }

    public void changeState(StyleState newState)
    {
        currentState = newState;
    }

    public void normalOpertion()
    {
        currentState.normalOpertion(this);
    }

    public void useBttlChip()
    {
        currentState.useBttlChip(this);
    }

    public void naviCustBug()
    {
        currentState.naviCustBug(this);
    }
}