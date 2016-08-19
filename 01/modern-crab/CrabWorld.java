import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        prepCrab();
        prepWorm();
    }
    
    public void prepCrab()
    {
        Actor crab;
        crab = new Crab();
        addObject(crab, 280, 280);
    }
    
    public void prepWorm()
    {
        Actor worm;
        int x, y;
        for(int i=0; i<15; i++)
        {
            worm = new Worm();
            x = Greenfoot.getRandomNumber(500);
            y = Greenfoot.getRandomNumber(500);
            addObject(worm, x, y);
        }
    }
}
