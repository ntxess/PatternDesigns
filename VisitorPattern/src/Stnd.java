public class Stnd implements Element // Concrete Element
{
    private String chipColor;
    public Stnd(String color)
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