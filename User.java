import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor
{
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    private int score;
    public User(String name){
        this.name = name;
        this.score = 0;
    }
    public void act() 
    {
       
    }    
    public String getName(){return this.name;}
    public int getScore(){return this.score;}
    public void addPoint(){this.score++;}
}
