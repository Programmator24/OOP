import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<Animal> animalList = List.of(
            new Cow("Korova"),
            new Lion("Lev"),
            new Duck("Donald")
            );
        // Cow cow = new Cow("Korova");
        // Lion lion = new Lion("Lev");
        // Duck duck = new Duck("Donald");

        Zoo zoo = new Zoo(animalList);
        
        // for (Animal animal : zoo.getAnimalList()) 
        // {
        //     System.out.println(animal.say());   
        // }
        System.out.println("_____________Flyable_Animals_____________");
        for (Flyable animal : zoo.getFlyableList()) 
        {
            System.out.println(((Animal)animal).getName());
            System.out.println("say: " + ((Animal)animal).say());
            System.out.println("Fly_Speed = " + animal.getSpeedFlyable());
            System.out.println("_____");    
        }
        System.out.println("_____________Runamle_Animals_____________");
        for (Runable animal : zoo.getRunableList()) 
        {
            System.out.println(((Animal)animal).getName());
            System.out.println("say: " + ((Animal)animal).say());
            System.out.println("Run_Speed = " + animal.getSpeedRunable());
            System.out.println("_____");   
        }
        System.out.println("_____________Swimable_Animals_____________");
        for (Swimable animal : zoo.getSwimableList()) 
        {
            System.out.println(((Animal)animal).getName());
            System.out.println("say: " + ((Animal)animal).say());
            System.out.println("Swim_Speed = " + animal.getSpeedSwimable());
            System.out.println("_____");    
        }
        


        
    }
    
}
