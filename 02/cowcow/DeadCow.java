import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class deadCow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeadCow extends Actor
{
    /**
     * Act - do whatever the deadCow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage deadCow = new GreenfootImage("deadCow.png");
    private GreenfootImage boom = new GreenfootImage("boom.png");
    private int count = 0;

    public void act()
    {
        counter();
    }

    protected void addedToWorld(World world)
    {
        setImage(boom);
    }

    private void counter()
    {
        if(count <= 2)
        {
            count++;
        }
        else
        {
            setImage(deadCow);
        }
    }
}
