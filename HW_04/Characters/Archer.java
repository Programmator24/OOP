package HW_04.Characters;


import HW_04.Armor.NoShield;
import HW_04.Weapons.Bow;

import java.util.Random;

public class Archer extends Warrior 
{
    private Random random = new Random(); 

    public Archer (String name, Bow weapon, NoShield armor)
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
        return "Archer" + super.toString();
    }
}
