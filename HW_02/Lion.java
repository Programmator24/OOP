public class Lion extends Predator implements Swimable, Runable
{
    private Integer runSpeed = 17;

    private Integer swimSpeed = 3;

    public Lion(String name)
    {
        super(name);
    }

    @Override
    public String say() {
        return "ARRRR";
    }

    @Override
    public Integer getSpeedRunable() {
        return this.runSpeed;
    }

    @Override
    public Integer getSpeedSwimable() {
        return this.swimSpeed;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
