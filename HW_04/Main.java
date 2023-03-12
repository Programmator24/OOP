package HW_04;

import HW_04.Armor.MagicShield;
import HW_04.Armor.NoShield;
import HW_04.Characters.Archer;
import HW_04.Characters.SwordMan;
import HW_04.Characters.Warrior;
import HW_04.Teams.Team;
import HW_04.Weapons.Bow;
import HW_04.Weapons.Sword;

public class Main 
{
    public static void main(String[] args) 
    {
        Team<Warrior> team_a = new Team<>("team_a");
        team_a.addWarrior(new Archer("Victor", new Bow(), new NoShield()));
        team_a.addWarrior(new Archer("Elf", new Bow(), new NoShield()));
        team_a.addWarrior(new SwordMan("Ork", new Sword(), new MagicShield()));

        System.out.println("________________");
        System.out.println(team_a);
    }
    
}
