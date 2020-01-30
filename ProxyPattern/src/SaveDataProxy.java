public class SaveDataProxy implements SaveData // Proxy
{
    SaveData save;
    public void saveGame()
    {
        save = SaveDataImpl.getInst();
        save.saveGame();
    }
}