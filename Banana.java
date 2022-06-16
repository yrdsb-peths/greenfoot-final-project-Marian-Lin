import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (Marian) 
 * @version (June 2022)
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
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
        
        World world = getWorld();
        if(timer <= 0)
        {
            world.removeObject(this);
        }
    }
}
