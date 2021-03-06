import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cow extends Actor
{
    /**
     * Act - do whatever the Cow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private final static int MaxMilk = 300;
    private final static int MinMilk = 0;
    private final static int milkGenerateRate= 1;
    private final static int milking = 5;
    private MilkBar milkBar;
    private int currentMilk = 50;

    public void act() 
    {
        // Add your action code here.
        generateMilk();
        dead();
    }

    public int giveMilk()
    {
        int givenMilk;
        currentMilk -= milking;
        if(isMinMilk())
        {
            givenMilk = milking + currentMilk;
        }
        else
        {
            givenMilk = milking;
        }
        normalizeMilk();
        milkBar.updateValue(currentMilk);
        return  givenMilk;
    }

    protected void addedToWorld(World world)
    {
        milkBar = new MilkBar(MaxMilk, MinMilk, currentMilk);
        world.addObject(milkBar, this.getX() + 125, this.getY());
    }

    private void generateMilk()
    {
        currentMilk += milkGenerateRate;
        normalizeMilk();
        milkBar.updateValue(currentMilk);
    }

    private void dead()
    {
        if(isMaxMilk())
        {
            World world;
            DeadCow deadCow;
            world = getWorld();
            deadCow = new DeadCow();
            world.addObject(deadCow, this.getX(), this.getY());
            world.removeObject(milkBar);
            world.removeObject(this);
        }
    }

    private void normalizeMilk()
    {
        if(isMaxMilk())
        {
            currentMilk = MaxMilk;
        }
        else if(isMinMilk())
        {
            currentMilk = MinMilk;
        }
    }

    private boolean isMaxMilk()
    {
        return currentMilk >= MaxMilk;
    }

    private boolean isMinMilk()
    {
        return currentMilk <= MinMilk;
    }
}
