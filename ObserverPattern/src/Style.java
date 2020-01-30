import java.util.*;

public class Style implements Subject // Concrete Subject : OBSERVER // Context: STATE
{
    private List<Observer> observers = new ArrayList<Observer>();
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
        Notify();
    }

    public void useBttlChip()
    {
        currentState.useBttlChip(this);
        Notify();

    }

    public void naviCustBug()
    {
        currentState.naviCustBug(this);
        Notify();
    }

    @Override
    public void attach(Observer obs)
    {
        observers.add(obs);
        System.out.println("Monitoring Status!");
        System.out.println("=============================");

    }

    @Override
    public void detach(Observer obs)
    {
        if(observers.contains(obs))
        {
            observers.remove(obs);
            System.out.println("=============================");
            System.out.println("No longer monitoring Status!");
        }
    }

    public void Notify()
    {
        for(Observer obs:observers)
        {
            obs.Update(this);
        }
    }

    public String getName()
    {
        return name;
    }

}