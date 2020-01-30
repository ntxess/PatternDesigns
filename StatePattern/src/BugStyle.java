public final class BugStyle implements StyleState // Concrete State
{
    public static int currentLVL = 0;
    private static BugStyle instance = null;
    public synchronized static BugStyle getInst()
    {
        if (instance == null)
        {
            instance = new BugStyle();
            System.out.println("**Bug Style Discovered**");
        }
        currentLVL++;
        return instance;
    }

    private BugStyle() {}

    @Override
    public void normalOpertion(Style state)
    {
        state.changeState(NormalStyle.getInst());
        System.out.println("Evolving to Normal Style LVL" + NormalStyle.currentLVL);
    }

    @Override
    public void useBttlChip(Style state)
    {
        state.changeState(CustomStyle.getInst());
        System.out.println("Evolving to Custom Style LVL" + CustomStyle.currentLVL);
    }

    @Override
    public void naviCustBug(Style state)
    {
        currentLVL++;
        System.out.println("Bug Style LVL" + currentLVL);
    }
}