import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Musuh extends Actor
{
    /**
     * Act - do whatever the Musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    abstract void cetakbaru();
    abstract void maju();
    
    void kenapiso(){
        Counter.add(1);  //skor untuk hero
        
        Greenfoot.playSound("kena.wav");
        Berdarah darah= new Berdarah();
        getWorld().addObject(darah,getX(),getY());
        
        cetakbaru();
        getWorld().removeObject(this);
        
        
    
    }
    
    public void act() 
    {
        // Add your action code here.
        maju();
        if (isAtEdge()){
            setLocation(699,340);
        }
        
        if(isTouching(begalomen.class)){            
            kenapiso();
        }
        
        else if(isTouching(Pisau.class)){
            removeTouching(Pisau.class);
            kenapiso();
        }
        
        
    }    
}
