// Concrete Product

public class Bass extends Navi {
    private Boolean customizable = false;
    public Bass()
    {
        setName("Bass.exe");
        setHP(700);
        setCustomizable(customizable);
        setWeapon("Buster-Rake");
        setCustomizable(customizable);
    }

    public void attack() {
        System.out.println("\t" + getName() + " is using his " + getAtkType() + " attack, " + getWeapon() + "!");
    }
}
