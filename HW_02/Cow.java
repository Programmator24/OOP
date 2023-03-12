public class Cow extends Herbivores implements Runable
{
    Integer runSpeed = 5;

    public Cow(String name)
    {
        super(name);
    }
    
    @Override
    public String say() 
    {
        return "Moooo";
        
    }
    @Override
    public Integer getSpeedRunable() {
        return this.runSpeed;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
