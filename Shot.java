import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    /**
     * Act - do whatever the Shot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(getX(),getY()-5);
         if(getY() <=0)
        {
            getWorld().removeObject(this);
            return;

        } 
        destroy();
        
    }    public void destroy()
    {
         Actor Asteroid;
         Actor Shot2;
         Actor Penguin;
        Asteroid = getOneObjectAtOffset(0,0,Asteroid.class);
        Shot2 = getOneObjectAtOffset(0,0,Shot2.class);
        Penguin = getOneObjectAtOffset(0,0,Penguin.class);
        
        if(Asteroid != null || Shot2 != null || Penguin != null)
        {
        MyWorld world;
        world = (MyWorld) getWorld();
        
        Counter myCounter = world.getCounter();
        myCounter.increaseCounter();
        
        world.removeObject(Asteroid);
        world.removeObject(Shot2);
        world.removeObject(Penguin);
        world.removeObject(this);
        
        
        
     
               
       } 

 
    }
    
        
    }





 





