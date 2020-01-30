public final class NormalStyle implements StyleState // Concrete State
{
    public static int currentLVL = 0;
    private static NormalStyle instance = null;
    public synchronized static NormalStyle getInst()
    {
        if (instance == null)
        {
            instance = new NormalStyle();
            System.out.println("**Normal Style Discovered**");
        }
        currentLVL++;
        return instance;
    }

    private NormalStyle() {}

    @Override
    public void normalOpertion(Style state)
    {
        currentLVL++;
        System.out.println("Normal Style LVL" + currentLVL);
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
        state.changeState(BugStyle.getInst());
        System.out.println("Evolving to Bug Style LVL" + BugStyle.currentLVL);
    }
}