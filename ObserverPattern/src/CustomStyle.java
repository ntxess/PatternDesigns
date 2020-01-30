public final class CustomStyle implements StyleState // Concrete State
{
    public static int currentLVL = 0;
    private static CustomStyle instance = null;
    public synchronized static CustomStyle getInst()
    {
        if (instance == null)
        {
            instance = new CustomStyle();
            System.out.println("**Custom Style Discovered**");
        }
        currentLVL++;
        return instance;
    }

    private CustomStyle() {}

    @Override
    public void normalOpertion(Style state)
    {
        state.changeState(NormalStyle.getInst());
        System.out.println("Evolving to Normal Style LVL" + NormalStyle.currentLVL);
    }

    @Override
    public void useBttlChip(Style state)
    {
        currentLVL++;
        System.out.println("Custom Style LVL" + currentLVL);
    }

    @Override
    public void naviCustBug(Style state)
    {
        state.changeState(BugStyle.getInst());
        System.out.println("Evolving to Bug Style LVL" + BugStyle.currentLVL);
    }
}