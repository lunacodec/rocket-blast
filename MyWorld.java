import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int SpawnTimer = 0;
    int SpawnTimer2 = 0;
    
    private Counter myCounter;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        myCounter = new Counter();
        addObject(myCounter, 50,20);
        prepare();
    }
    public Counter getCounter()
    {
        return myCounter;
        
    }
    public void act()
    {
       SpawnTimer++;
       SpawnTimer2++;
        if(SpawnTimer == 75)
        {
          addObject(new Asteroid(),Greenfoot.getRandomNumber(100)+50,350);
          SpawnTimer = 0;
       }
       if(SpawnTimer2 == 75)
       {
           addObject(new Asteroid2(),Greenfoot.getRandomNumber(100)+50,250);
           SpawnTimer2 = 0;
           
           
           
       }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        /*
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,301,51);
         */
        Rocket rocket = new Rocket();
        addObject(rocket,303,342);

        Asteroid asteroid = new Asteroid();
        addObject(asteroid,319,42);
        asteroid.setLocation(311,36);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(302,342);
        rocket.setLocation(492,573);
        rocket.setLocation(461,538);
        asteroid.setLocation(411,211);
        removeObject(asteroid);
        rocket.setLocation(503,543);
        rocket.setLocation(413,540);
        rocket.setLocation(414,546);
        Penguin penguin = new Penguin();
        addObject(penguin,422,46);
    }
 }

