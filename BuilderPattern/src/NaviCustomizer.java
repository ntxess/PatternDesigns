public class NaviCustomizer implements Customizer{
    private String soul;
    private String color;
    private String weapon;
    private int attack;
    private int health;

    @Override
    public void soulCustomizer(String soul) {
        this.soul = soul;
    }

    @Override
    public void colorCustomizer(String color) {
        this.color = color;
    }

    @Override
    public void weaponCustomizer(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attackCustomizer(int attack) {
        this.attack = attack;
    }

    @Override
    public void healthCustomizer(int health) {
        this.health = health;
    }

    public Navi installCustomization() {
        return new Navi(soul, color, weapon, attack, health);
    }
}
