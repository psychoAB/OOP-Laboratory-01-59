import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            turn(10);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            turn(-10);
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
}
