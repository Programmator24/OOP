package HW_04.Teams;

import java.util.ArrayList;

public class Team<T>
{
    private ArrayList<T> team = new ArrayList<T>();

    private String name;

    public Team(String name)
    {
        this.name = name;
    }

    public Team<T> addWarrior(T warrior)
    {
        team.add(warrior);
        return this;
    }

    @Override
    public String toString() 
    {
        StringBuilder teamBuilder = new StringBuilder();
        for (T item : team) 
        {
            teamBuilder.append(item.toString() + "\n");  
        }   
        return String.format("%s: %s \n",name, teamBuilder);    
    }
}
