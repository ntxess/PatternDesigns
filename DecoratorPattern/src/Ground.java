public class Ground extends FieldElementDecorator // Concrete Decorator
{
    public Ground(Battlefield newField)
    {
        super(newField);
        System.out.println("GROUND");
    }

    public String getDescription()
    {
        return field.getDescription() + ", Ground";
    }
}