package HW_04.Armor;

public class NoShield implements Armor 
{
    @Override
    public Integer armorHealth() 
    {
        return 0;
    } 

    @Override
    public String toString() 
    {
        return ": " + armorHealth();
    }
}
