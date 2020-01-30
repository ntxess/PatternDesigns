public class HPBar extends FieldElementDecorator // Concrete Decorator
{
    public HPBar(Battlefield newField)
    {
        super(newField);
        System.out.println("HP");
    }

    public String getDescription()
    {
        return field.getDescription() + ", HPBar";
    }
}