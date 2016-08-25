import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class MilkBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MilkBar extends Actor
{
    /**
     * Act - do whatever the MilkBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private final static int FrameBegin = 21;
    private final static int MaxBarWidth = 23;
    private final static int MaxBarHeight = 80;
    private static GreenfootImage milkBarImage = new GreenfootImage("milkBar.png");
    private int barHeight;
    private int maxValue;
    private int minValue;
    private int value;
    private int yShift;

    public MilkBar(int __MaxValue, int __MinValue, int __Value)
    {
        maxValue = __MaxValue;
        minValue = __MinValue;
        value = __Value;
        calculateBarHeight();
        render();
    }

    public void updateValue(int newValue)
    {
        value = newValue;
        calculateBarHeight();
        render();
    }

    private void render()
    {
        GreenfootImage bar = new GreenfootImage(milkBarImage);
        bar.setColor(Color.GREEN);
        bar.fillRect(FrameBegin , FrameBegin + yShift, MaxBarWidth, barHeight);
        setImage(bar);
    }
    
    private void calculateBarHeight()
    {
        barHeight = (int)((float)MaxBarHeight / (float)maxValue * value);
        yShift = MaxBarHeight - barHeight;
    }
}
