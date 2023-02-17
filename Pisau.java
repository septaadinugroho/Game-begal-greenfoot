import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pisau here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pisau extends Actor
{
    /**
     * Act - do whatever the Pisau wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Pisau()
    {
    setImage("pisau.png");
    }
    
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+3, getY());
        if(getX()>=699){
            getWorld().removeObject(this);
        }
        
        
    }    
}
