// Concrete Product


public class Megaman extends Navi {
    private Boolean customizable = true;
    public Megaman()
    {
        setName("Megaman.exe");
        setHP(500);
        setCustomizable(customizable);
        setWeapon("Mega-Buster");
        setCustomizable(customizable);
    }

    public void attack() {
        System.out.println("\t" + getName() + " is using his " + getAtkType() + " attack, " + getWeapon() + "!");
    }
}
