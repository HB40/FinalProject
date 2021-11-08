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
    private int counter = 0;
    private int ammo = 100;
    private int meteorTime = 50;
    private int prev = 0;
    /**
     * Act - do whatever the spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public spaceship(){
        this.life = true;
        
    }
    public void act() 
    {
        if((MyWorld.userList.get(MyWorld.userList.size()-1).getScore()+1) % 10 == 0){
            if(MyWorld.userList.get(MyWorld.userList.size()-1).getScore() != prev){ 
                meteorTime -= 2;
            }
        }
        if (this.counter >= meteorTime){
            getWorld().addObject(new meteor(), 600, (int)(Math.random()*400));
            this.counter =0;
        }
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
        
        if(Greenfoot.isKeyDown("p") && counter % 5 == 0 && this.ammo > 0){
            getWorld().addObject(new laser(), this.getX(), this.getY());
            this.ammo--;
        }
        counter++;
        getWorld().showText("Score: " +MyWorld.userList.get(MyWorld.userList.size()-1).getScore(), 60, 365);
        getWorld().showText("Ammo: " +this.ammo, 60, 385);
        this.prev = MyWorld.userList.get(MyWorld.userList.size()-1).getScore();
    } 
    public boolean getLife(){
        return this.life;
    }
    
}
