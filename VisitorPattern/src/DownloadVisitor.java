public class DownloadVisitor implements ChipVisitor // Concrete Visitor
{
    public DownloadVisitor() {}

    @Override
    public String visit(Stnd chip)
    {
        return "Standard Chip Download!";
    }

    @Override
    public String visit(Mega chip)
    {
        return "Mega Chip Download!";
    }

    @Override
    public String visit(Giga chip)
    {
        return "Giga Chip Download!";
    }
}