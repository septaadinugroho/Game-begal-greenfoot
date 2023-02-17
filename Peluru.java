import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru extends Actor
{
    /**
     * Act - do whatever the Peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Peluru()
    {
    setImage("bullet.png");
    }
    
    public void act() 
    {
        // Add your action code here.
        setRotation(90);
        setLocation(getX()-4, getY());
        if(getX()<=0){
            getWorld().removeObject(this);
        }
        
        
    }    
}
