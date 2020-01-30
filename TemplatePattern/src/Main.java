public class Main
{
    public static void main(String args[])
    {
        // Basic idea is to just make a function using classes and then polymorph the subclass that calls it
        // Imagine a method that applies the respective method calls to specific objects, there are two ways to do this:
        // 1. Create conditional function that, depending on what object you want will call the respective methods
        // 2. Using polymorphism you can provide a template/abstract class that will let subclass inherit from.
        //      The method calls in the template class will automatically at runtime call the respective methods
        //      depending on the class obj its from.

        // The idea is that you make a method that calls all of these as one method
        Navi megaman = new Megaman();
        Navi roll = new Roll();
        Navi bass = new Bass();

        megaman.executeCommand();
        roll.executeCommand();
        bass.executeCommand();


        // Without Template
        // Now what if you just want to do one
        Megaman megaman2 = new Megaman();
        Roll roll2 = new Roll();
        Bass bass2 = new Bass();

        megaman2.generate();
        megaman2.attack();
        megaman2.move();

        roll2.generate();
        roll2.attack();
        roll2.move();

        bass2.generate();
        bass2.attack();
        bass2.move();
    }
}