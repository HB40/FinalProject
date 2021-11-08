import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/* Checklist:
 * Huge Mission:
 *  Objective: travel through space to find a supercrystal while battling enemy forces and return home safely.
 *  Part 1: Asteroids
 *  Part 2: Enemy Spaceships
 *  Part 3: land on planet and fight aliens while looking for something
 * Sound Effects
 * Health
 * Powerups: (Shields, ammo refills)
 * Other spaceships that fight you
 * 
 */
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
    
    
    public laser(){
        GreenfootImage myImage = getImage();
        int newWidth = (int)(myImage.getWidth()/3);
        int newHeight = (int)(myImage.getHeight()/3);
        myImage.scale(newWidth, newHeight);
        
        
    }
    public void act() 
    {
        move(6);
        if(this.isTouching(meteor.class)) {
            this.removeTouching(meteor.class);
            getWorld().removeObject(this);
            //ADD ONE TO SCORE
            MyWorld.userList.get(MyWorld.userList.size()-1).addPoint();
        } else if (this.isAtEdge() == true){
            getWorld().removeObject(this);
        }
        
        
    }    
}
