public interface ChipVisitor // Visitor
{
    public String visit(Stnd chip);
    public String visit(Mega chip);
    public String visit(Giga chip);
}