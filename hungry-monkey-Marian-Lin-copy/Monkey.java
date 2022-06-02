import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkey here.
 * 
 * @author (Marian) 
 * @version (1st. June 2022)
 */
public class Monkey extends Actor
{
    /**
     * Act - do whatever the Monkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            facing = "d";
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            facing = "a";
        }
    }
}
