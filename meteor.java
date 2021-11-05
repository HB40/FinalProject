import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meteor extends Actor
{
    /**
     * Act - do whatever the meteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public meteor(){turn(180);}
    public void act() 
    {
        move(3);
        if (this.isAtEdge()==true){
            getWorld().removeObject(this);
        }
    }    
}
