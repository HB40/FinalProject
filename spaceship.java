import java.util.ArrayList;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spaceship extends Actor
{
    private ArrayList<User> Users;
    private boolean life;
    /**
     * Act - do whatever the spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public spaceship(){
        this.life = true;
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("w") == true && this.getY() != 0){
           turnTowards(75, 0);
           move(3);
           turn(90);
           
            
            
        }
        if(Greenfoot.isKeyDown("s") == true && this.getY() != 400){
           turnTowards(75, 400);
           move(3);
           turn(270);
           
            
            
        }
        if(Greenfoot.isKeyDown("x") == true){
         this.life = false;
        
        }
    } 
    public boolean getLife(){
        return this.life;
    }
}
