import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beer here.
 * 
 * @author (Marian) 
 * @version (June 2022)
 */
public class Beer extends Actor
{
    /**
     * Act - do whatever the Beer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 1000;
    public void act()
    {
        // Add your action code here.
        int x =getX();
        int y = getY();
        setLocation(x,y);
        
        //move banana and draw the game over when the time is over.
        MyWorld world2 = (MyWorld) getWorld();
        if(timer <= 0)
        {
            world2.removeObject(this);
        }
    }
}
