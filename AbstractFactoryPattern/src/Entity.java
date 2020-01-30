// Product

public abstract class Entity {
    private String name;
    private int HP;
    private String atkType;
    private String weapon;
    private Boolean customizable = false;

    public String getName()
    {
        return name;
    }

    public int getHP()
    {
        return HP;
    }

    public String getAtkType()
    {
        return atkType;
    }

    public String getWeapon() {
        return weapon;
    }

    public Boolean getCustomizable() {
        return customizable;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setHP(int newHP)
    {
        HP = newHP;
    }

    public void setAtkType(String newAtkType)
    {
        atkType = newAtkType;
    }

    public void setWeapon(String newWeapon) {
        weapon =  newWeapon;
    }

    void setCustomizable(Boolean newCustomizable) {
        customizable = newCustomizable;
    }

    public void attack() {
        System.out.println("\t" + getName() + " is using its " + getAtkType() + " attack, " + getWeapon() + "!");
    }
}
