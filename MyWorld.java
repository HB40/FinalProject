import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static ArrayList<User> userList = new ArrayList<>();;
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
        String name = Greenfoot.ask("What's up? Please enter your name: ");
        User newuser = new User(name);
        userList.add(newuser);
        spaceship ship = new spaceship();
        addObject(ship, 75, 200);
        for (User user : userList){System.out.println(user.getName());}
        

        
    }
    public static String sortList(){
        int min;
        String string = "";
        for (int i = 0; i<userList.size(); i++){
            //min = 1000000000000000000000000000000000;
            for (int z = 0; z<userList.size(); z++){
                if (userList.get(i).getScore()<userList.get(z).getScore()){
                    User temp1 = userList.get(i);
                    userList.set(i, userList.get(z));
                    userList.set(z, temp1);
                }
                
            }
        } 
        for (User user : userList){
                string = string + user.getName()+"           "+user.getScore()+"\n";
            
            }
        return string;
    }
    public static String getNames(){
        String string = "";
        for (User user : userList){
                string = string + user.getName()+"\n";
            
            }
            return string;
    }
    public static String getScores(){
    String string = "";
        for (User user : userList){
                string = string + user.getScore()+"\n";
            
            }
            return string;
    }
}
