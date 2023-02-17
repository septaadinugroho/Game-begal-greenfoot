import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class polisi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class polisi extends Musuh implements Senjata
{
    /**
     * Act - do whatever the polisi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    void cetakbaru(){
        polisi boss = new polisi();
        getWorld().addObject(boss,getX()+700,getY()+340);
        
    }
    
    void maju(){
        move(-3);
    
    }   
    
    public void tembak(){
        count++;
        if(count>=100){
            Peluru karet= new Peluru();
            getWorld().addObject(karet,getX(),getY());
            Greenfoot.playSound("hit.wav");
            count=0;
        }
    }
    
    public void act(){
        super.act();
        tembak();
    }
}
