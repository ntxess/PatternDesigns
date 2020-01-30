public class SaveDataImpl implements SaveData // Target
{
    private static SaveDataImpl instance = null;
    public synchronized static SaveDataImpl getInst()
    {
        if (instance == null)
        {
            instance = new SaveDataImpl();
            System.out.println("New Game Saved");
        }
        return instance;
    }

    public void deleteGame()
    {
        System.out.println("Deleting Save Game!");
    }

    public void modifyGame()
    {
        System.out.println("Modifying Save Game!");
    }

    public void saveGame()
    {
        System.out.println("Saving Game!");
    }
}