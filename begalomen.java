import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class begalomen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class begalomen extends Actor implements Senjata
{
    /**
     * Act - do whatever the begalomen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count=0;
    boolean onGround = true;
    GreenfootSound song= new GreenfootSound ("song.wav");
    begalomen()
    {
    setImage("begalomen.png");
    }
    private int gravity;
    public void tembak(){
        count++;
        if(count>=10){
            Pisau sajam= new Pisau();
            getWorld().addObject(sajam,getX(),getY());
            Greenfoot.playSound("whizz3.wav");
            count=0;
        }
    }
    
    void kenatembak(){
        
        Greenfoot.playSound("pain1.wav");
        Berdarah darah= new Berdarah();
        getWorld().addObject(darah,getX(),getY());
                         
    }
    
    public void act() 
    {
        // Add your action code here.
        song.playLoop();
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+3, getY());
        }
        else if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-2, getY());
        }
        
        if(Greenfoot.isKeyDown("space")){
            tembak();
        }        
        else if(isTouching(Peluru.class)){
            CounterNyawa.add(-1);
            
            removeTouching(Peluru.class);
            kenatembak();
        }
        else if(isTouching(pesepeda3.class)){
            CounterNyawa.add(-1);
            kenatembak();
        }
        gravity--;
   setLocation(getX(), getY() - gravity);
   checkForJump();
        
        if(CounterNyawa.value==0){
            GameOver selesai = new GameOver();
            getWorld().addObject(selesai, 300, 100);
            getWorld().removeObject(this);
            song.stop();
        }
        
    } 
    private void checkForJump()
{
    if (onGround && Greenfoot.isKeyDown("up")){
         gravity = 10; // this will make the character jump
    }
}
}
