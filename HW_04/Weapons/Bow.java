package HW_04.Weapons;

public class Bow implements Weapon
{

    @Override
    public Integer damage() 
    {
        return 30;
    }

    @Override
    public String toString() 
    {
        return "Super_Bow";
        
    }
}
