public class Mega implements Element // Concrete Element
{
    private String chipColor;
    public Mega(String color)
    {
        chipColor = color;
    }

    public String getColor()
    {
        return chipColor;
    }

    public String accept(ChipVisitor visitor)
    {
        return visitor.visit(this);
    }
}