 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    int asteroidMove = 1;
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() +asteroidMove,getY());
        move();
        death();
    } 
    public void move()
    {
        if(getX() > 750 || getX() < 10)
        {
            setLocation(getX(), getY()+40);
            asteroidMove *= -1;
            
        
        }
   }
   public void death()
   {
       Actor Rocket;
        Rocket = getOneObjectAtOffset(0,0,Rocket.class);
        
        MyWorld world;
        world = (MyWorld) getWorld();
        world.removeObject(Rocket);
       
    }
}
