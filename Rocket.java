import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    int timer = 0;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
 
    public void act() 
    {
 
   
       if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
       if(Greenfoot.isKeyDown("Right"))
        {
            move(3);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            timer ++;
            if(timer == 50)
            {
            getWorld().addObject(new Shot(),getX(),getY());
            timer = 0;
           }
         
       }    
   }
}
