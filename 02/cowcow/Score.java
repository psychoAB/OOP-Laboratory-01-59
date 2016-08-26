import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int score = 0;

    public void act() 
    {
        // Add your action code here.
        getScore();
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }

    private void getScore()
    {
        World world = getWorld();
        score = world.getObjects(Player.class).get(0).milkTank();
    }

    private void setScore(int newScore)
    {
        score = newScore;
    }
}
