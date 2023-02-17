import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Berdarah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Berdarah extends Actor
{
    /**
     * Act - do whatever the Berdarah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    Berdarah()
    {
    setImage("darah.png");
    }
    
    public void act() 
    {
        // Add your action code here.
        count++;
        if(count>=2){
            getWorld().removeObject(this);
        }
    }    
}
