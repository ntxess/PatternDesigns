abstract class FieldElementDecorator implements Battlefield // Decorator
{
    protected Battlefield field;
    public FieldElementDecorator(Battlefield newField)
    {
        field = newField;
        System.out.println("DECO");
    }

    public String getDescription()
    {
        return field.getDescription();
    }
}