package HW_04.Weapons;

public class Sword implements Weapon
{

    @Override
    public Integer damage() 
    {
        return 50;
    }
    
    @Override
    public String toString() {
        return "Super_Sword";
    }

    
}
