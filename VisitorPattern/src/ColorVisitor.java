public class ColorVisitor implements ChipVisitor // Concrete Visitor
{
    public ColorVisitor() {}

    @Override
    public String visit(Stnd chip)
    {
        return "Standard Chip Color: " + chip.getColor();
    }

    @Override
    public String visit(Mega chip)
    {
        return "Mega Chip Color: " + chip.getColor();
    }

    @Override
    public String visit(Giga chip)
    {
        return "Giga Chip Color: " + chip.getColor();
    }
}