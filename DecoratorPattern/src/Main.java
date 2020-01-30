public class Main
{
    public static void main(String args[])
    {
        // field is instantiated left to right
        // 1. Ground object is created new but need CustomGauge
        // 2. CustomGauge is created new but need HPBar
        // 3. HPBar is created new but needs Map
        // 4. Map object is created new and is stored into FieldElementDecorator of HPBar since it implements the class
        // 5. HPBar object is stored into FieldElementDecorator of CustomGauge since it implements the class
        // 6. CustomGauge is stored into FieldElementDecorator of Ground since it implements the class
        // 7. Ground is stored into field.
        Battlefield field = new Ground(new CustomGauge(new HPBar(new Map())));

        // Ground calls getDescription() of its field object saved in FieldElementDecorator which was CustomGauge
        // CustomGauge calls getDescription() of its field object saved in FieldElementDecorator which was HPBar
        // HPBar calls getDescription() of its field object saved in FieldElementDecorator which was Map
        // Map returns "Map", then getDescription trace back starts to appends the return value out back to Ground.
        System.out.println(field.getDescription());

        // CComponent Implementing from IComponent means that:
        // 1. It will be the same data type as the other concrete decorator
        // 2. It does not have a has-a component therefore it can be used as a basecase//return object
        // 3. Extending would mean that the Decorator will need to be initialized but there would be no value for the
        //      normal constructor
    }
}