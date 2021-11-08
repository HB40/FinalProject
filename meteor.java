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
    boolean a;
    public meteor(){
      turn(180);
      this.a = false;
      GreenfootImage myImage = getImage();
      int newWidth = (int)(myImage.getWidth()/4);
      int newHeight = (int)(myImage.getHeight()/4);
      myImage.scale(newWidth, newHeight);
    }
    public void act() 
    {
        move(3);
        if(a == true){
            
            getWorld().showText("GAME OVER\n", 300, 170);
            getWorld().showText(MyWorld.getNames() , 150, 230);
            getWorld().showText(MyWorld.getScores() , 450, 230);
            
        }
        if(this.isTouching(spaceship.class)){
            this.removeTouching(spaceship.class);
            a = true;
            
        }
         if (this.isAtEdge()==true){
            getWorld().removeObject(this);
            
        }
        
    }    
}
