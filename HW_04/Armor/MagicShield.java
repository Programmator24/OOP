package HW_04.Armor;

public class MagicShield implements Armor
{

    @Override
    public Integer armorHealth() {
        return 200;
    }
    
    @Override
    public String toString() 
    {
        return ": " + armorHealth();
    }
    
}
