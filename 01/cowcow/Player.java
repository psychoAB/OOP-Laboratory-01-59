import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private List<Cow> remainCows;
    private boolean leftHand = null;

    public void act() 
    {
        // Add your action code here.
        getRemainCow();
        if(Greenfoot.isKeyDown("up"))
        {
            moveUp();
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            moveDown();
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            getMilk("left");
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            getMilk("right");
        }
    }
    
    private void getRemainCow()
    {
        World world = getWorld();
        remainCows = world.getObjects(Cow.class);
    }

    private void moveUp()
    {
        List<Cow> upCows = new ArrayList<Cow>();
        Cow nearestUpCow = null;
        for(int i = 0; i < remainCows.size(); i++)
        {
            if(remainCows.get(i).getY() < this.getY())
            {
                upCows.add(remainCows.get(i));
            }
        }
        for(int i = 0; i < upCows.size(); i++)
        {
            if(nearestUpCow == null || nearestUpCow.getY() < upCows.get(i).getY())
            {
                nearestUpCow = upCows.get(i);
            }
        }
        if(nearestUpCow!= null)
        {
            this.setLocation(nearestUpCow.getX(), nearestUpCow.getY());
        }
    }
    
    private void moveDown()
    {
        List<Cow> downCows = new ArrayList<Cow>();
        Cow nearestDownCow = null;
        for(int i = 0; i < remainCows.size(); i++)
        {
            if(remainCows.get(i).getY() > this.getY())
            {
                downCows.add(remainCows.get(i));
            }
        }
        for(int i = 0; i < downCows.size(); i++)
        {
            if(nearestDownCow == null || nearestDownCow.getY() > downCows.get(i).getY())
            {
                nearestDownCow = downCows.get(i);
            }
        }
        if(nearestDownCow != null)
        {
            this.setLocation(nearestDownCow.getX(), nearestDownCow.getY());
        }
    }

    private void getMilk(string arrow)
    {
        if(leftHand == null)
        {
            if(arrow == "left")
            {
                leftHand = false;
            }
            else if(arrow == "right")
            {
                leftHand = true;
            }
        }
        else
        {
            leftHand = !leftHand
        }
    }
}
