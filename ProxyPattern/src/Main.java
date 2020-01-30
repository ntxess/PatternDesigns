public class Main
{
    public static void main(String args[])
    {
        // Only when the Client NEEDS the instance of the SaveDataImpl is when it will be instantiated
        // Initially, the Client will instantiate an object of type SaveData using the SaveDataProxy since
        //      it also implements SaveData
        // game object will call a method of SaveDataImpl that implements the same type as the SaveDataProxy
        // But the since it now needs the SaveDataImpl object to call the method the proxy will finally
        //      instantiate the SaveDataImpl
        // The idea is to defer instantiation of SaveDataImpl until the object SaveDataImpl is need to call its method.
        SaveData game = new SaveDataProxy();
        game.saveGame();   // Saving Game!
        //game.deleteGame(); // Error
        //game.modifyGame(); // Error
    }
}