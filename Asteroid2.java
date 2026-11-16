import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid2 extends Actor
{
    int asteroid2Move = 1;
    /**
     * Act - do whatever the Asteroid2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
        {
        setLocation(getX() +asteroid2Move,getY());
        move();
        death();
    } 
    public void move()
    {
        if(getX() > 750 || getX() < 10)
        {
            setLocation(getX(), getY()-40);
            asteroid2Move *= -1;
            
        
        }
   }
   public void death()
   {
       Actor Penguin;
        Penguin = getOneObjectAtOffset(0,0,Penguin.class);
        
        MyWorld world;
        world = (MyWorld) getWorld();
        world.removeObject(Penguin);
       
    }
}

   
