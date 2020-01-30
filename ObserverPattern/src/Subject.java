public interface Subject // Subject : OBSERVER
{
    public void attach(Observer obs);
    public void detach(Observer obs);
    public void Notify();
}