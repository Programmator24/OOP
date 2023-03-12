import java.util.ArrayList;
import java.util.List;

public class Zoo 
{


    List<Animal> animalList = new ArrayList<>();

    public Zoo(List<Animal> animals)
    {
        animalList.addAll(animals);
    }

    public void addAnimal (List<Animal> animals)
    {
        animalList.addAll(animals);
    }

    public List<Animal> getAnimalList()
    {
        return animalList;
    }
    
    public List<Runable> getRunableList()
    {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : animalList) 
        {
            if(animal instanceof Runable)
            {
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList()
    {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : animalList) 
        {
            if(animal instanceof Flyable)
            {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public List<Swimable> getSwimableList()
    {
        List<Swimable> SwimableList = new ArrayList<>();
        for (Animal animal : animalList) 
        {
            if(animal instanceof Swimable)
            {
                SwimableList.add((Swimable) animal);
            }
        }
        return SwimableList;
    }

    
    
    
}
