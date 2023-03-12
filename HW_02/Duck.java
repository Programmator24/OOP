public class Duck extends Herbivores implements Flyable, Runable, Swimable
{
   private Integer flightSpeed = 15;

   private Integer runSpeed = 2;

   private Integer swimSpeed = 5;



    public Duck (String name) 
    {
        super(name);
    }
    @Override
    public String say() 
    {
        return"Krya-Krya";
        
    }
    @Override
    public Integer getSpeedFlyable() 
    {
        return this.flightSpeed;
    }
    @Override
    public Integer getSpeedRunable() 
    {
        return this.runSpeed;
    }
    @Override
    public Integer getSpeedSwimable() 
    {
        return this.swimSpeed;
    }
    @Override
    public String getName() {
        return name;
    }

    
}
