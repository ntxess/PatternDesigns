public class Main
{
    public static void main(String args[])
    {
        // Given two different classes of different type that want to be treated the same we use an adapter
        // The Adaptee is being wrapped around by the Target's interface through an Adapter
        // The Adapter is typed the same as the Target through the interface, they share a is-a
        // The Adapter has-an Adaptee in which it is used to call the Target's equivalent methods through the Adapter's
        //      wrapper.

        Navi megaman = new Megaman();
        Entity protoman = new Hero();
        Entity naviAdapterMegaman = new NaviAdapter(megaman);

        megaman.useChip(); // Using Battle Chip!
        protoman.attack(); // Entity attacks!
        naviAdapterMegaman.attack(); // Using Battle Chip!
    }
}