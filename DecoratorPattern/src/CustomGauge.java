public class CustomGauge extends FieldElementDecorator // Concrete Decorator
{
    public CustomGauge(Battlefield newField)
    {
        super(newField);
        System.out.println("GAUGE");
    }

    public String getDescription()
    {
        return field.getDescription() + ", CustomGauge";
    }
}