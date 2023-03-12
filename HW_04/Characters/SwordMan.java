package HW_04.Characters;


import HW_04.Armor.MagicShield;
import HW_04.Weapons.Sword;

import java.util.Random;

public class SwordMan extends Warrior
{
    private Random random = new Random(); 

    public SwordMan(String name, Sword weapon, MagicShield armor)
    {
        super(name, weapon, armor);
    }

    @Override
    public Integer hitDamage() 
    {
        return random.nextInt(weapon.damage()); 

    }

    @Override
    public Integer getArmor() 
    {
        return armor.armorHealth();
    }

    @Override
    public String toString() {
        return "SwordMan" + super.toString();
    }

    
    
    
}
