import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Crete a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage myImage = getBackground();
        int newWidth = (int)(myImage.getWidth()*1.3);
        int newHeight = (int)(myImage.getHeight()*1.3);
        myImage.scale(newWidth, newHeight);
        spaceship ship = new spaceship();
        addObject(ship, 75, 200);
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            Greenfoot.delay(150);
            addObject(new meteor(), 600, (int)(Math.random()*400));
        }
        
    }
}
