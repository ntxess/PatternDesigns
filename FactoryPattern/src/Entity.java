public abstract class Entity {
    private String name;
    private int HP;
    private String atkType;

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public int getHP()
    {
        return HP;
    }

    public void setHP(int newHP)
    {
        HP = newHP;
    }

    public String getAtkType()
    {
        return atkType;
    }

    public void setAtkType(String newAtkType)
    {
        atkType = newAtkType;
    }

    public void attack()
    {
        System.out.println(getName() + " is attacking with " + getAtkType() + " type!");
    }
}
