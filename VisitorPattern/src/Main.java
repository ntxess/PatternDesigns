public class Main
{
    public static void main(String args[])
    {
        // The visitor pattern takes the object that you want and performs the action in its own isolated class
        // The idea is to isolate this obscure method that does not belong and shouldnt belong in the specified class
        //      and give it its own in order to still run object specific actions to it.
        // The Visitor pattern suggests that you place the new behavior into a separate class called visitor,
        //      instead of trying to integrate it into existing classes.
        // Creating different Visitor and isolate those new behaviors outside of the class
        ChipVisitor chipRarity = new DownloadVisitor();
        ChipVisitor chipColor = new ColorVisitor();

        Stnd cannon = new Stnd("White");
        Mega roll = new Mega("Blue");
        Giga deltaz = new Giga("Red");

        System.out.println(cannon.accept(chipRarity));
        System.out.println(roll.accept(chipRarity));
        System.out.println(deltaz.accept(chipRarity));

        System.out.println("===========================");

        System.out.println(cannon.accept(chipColor));
        System.out.println(roll.accept(chipColor));
        System.out.println(deltaz.accept(chipColor));
    }
}