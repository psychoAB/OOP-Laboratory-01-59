import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        crabMove();
        crabEatWorm();
    }
    
    public void crabMove()
    { 
        if(Greenfoot.isKeyDown("up"))
        {
            turn(5);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            turn(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(10);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            move(-10);
        }
    }
    
    public void crabEatWorm()
    {
        Actor worm;
        worm = getOneObjectAtOffset(0,0,Worm.class);
        if(worm != null)
        {
            World world;
            world = getWorld();
            world.removeObject(worm);
        }
    }
}
