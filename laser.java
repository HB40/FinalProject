import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(6);
        if(this.isTouching(meteor.class)) {
            this.removeTouching(meteor.class);
            getWorld().removeObject(this);
            //ADD ONE TO SCORE
        } else if (this.isAtEdge() == true){
            getWorld().removeObject(this);
        }
        
        
    }    
}
