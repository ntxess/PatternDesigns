public class Map implements Battlefield // Concrete Component
{
    public String getDescription()
    {
        System.out.println("MAP");
        return "Map";
    }
}