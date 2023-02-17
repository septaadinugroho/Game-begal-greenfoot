import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesepeda3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesepeda3 extends Musuh
{
    /**
     * Act - do whatever the pesepeda3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    void cetakbaru(){
        pesepeda3 sepedabaja = new pesepeda3();
        getWorld().addObject(sepedabaja,getX()+700,getY()+360);
        
    }
    
    void maju(){
        move(-4);
    
    }   
    
}
