import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesepeda1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesepeda1 extends Musuh
{
    /**
     * Act - do whatever the pesepeda1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        pesepeda1 sepedakayu = new pesepeda1();
        getWorld().addObject(sepedakayu,getX()+700,getY()+340);
        
    }
    
    void maju(){
        move(-1);
    
    }    
}
