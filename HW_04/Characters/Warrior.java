package HW_04.Characters;

import HW_04.Armor.Armor;
import HW_04.Weapons.Weapon;

public abstract class Warrior 
{
    private String name;

    private Integer health;

    protected Weapon weapon;

    protected Armor armor;

    public Warrior (String name, Weapon weapon, Armor armor)
    {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        health = 100;
    }

    public abstract Integer getArmor();

    public abstract Integer hitDamage();

    public Integer getDamage()
    {
        return weapon.damage();
    }

    @Override
    public String toString() 
    {
        return "{name:"+name+" weapon:"+weapon+" health:"+health+" armor"+ armor+"}";

    }
        
}
