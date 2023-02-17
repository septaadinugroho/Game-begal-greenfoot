import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesepeda2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesepeda2 extends Musuh
{
    /**
     * Act - do whatever the pesepeda2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        pesepeda2 sepedabesi = new pesepeda2();
        getWorld().addObject(sepedabesi,getX()+700,getY()+340);
        
    }
    
    void maju(){
        move(-2);
    
    }    
}
