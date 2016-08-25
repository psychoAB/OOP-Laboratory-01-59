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

    private final static int MaxMilk = 100;
    private final static int MinMilk = 0;
    private final static int milkGenerateRate= 1;
    private final static int milking = 3;
    private int currentMilk = 50;

    public void act() 
    {
        // Add your action code here.
        generateMilk();
        giveMilk();
    }

    public int giveMilk()
    {
        int givenMilk;
        currentMilk -= milking;
        if(isMinMilk())
        {
            givenMilk = milking + currentMilk;
            normalizeMilk();
        }
        else
        {
            givenMilk = milking;
        }
        return  givenMilk;
    }

    private void generateMilk()
    {
        currentMilk += milkGenerateRate;
        if(isMaxMilk())
        {
            normalizeMilk();
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
        return currentMilk > MaxMilk;
    }

    private boolean isMinMilk()
    {
        return currentMilk < MinMilk;
    }
}
