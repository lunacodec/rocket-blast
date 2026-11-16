import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot2 extends Actor
{
    /**
     * Act - do whatever the Shot2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(getX(),getY()+5);
         if(getY() >590)
        {
            getWorld().removeObject(this);
            return;

        } 
        destroy();
        
    }    public void destroy()
    {
         Actor Asteroid2;
         Actor Shot;
         Actor Rocket;
        Asteroid2 = getOneObjectAtOffset(0,0,Asteroid2.class);
        Shot = getOneObjectAtOffset(0,0,Shot.class);
        Rocket = getOneObjectAtOffset(0,0,Rocket.class);
        
        if(Asteroid2 != null || Shot != null || Rocket != null)
        {
        MyWorld world;
        world = (MyWorld) getWorld();
        
        Counter myCounter = world.getCounter();
        myCounter.increaseCounter2();
        
        
        world.removeObject(Asteroid2);
        world.removeObject(Shot);
        world.removeObject(Rocket);
        world.removeObject(this);
               
       } 
     
 
    }


}
