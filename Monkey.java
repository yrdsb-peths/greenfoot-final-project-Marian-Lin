import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkey here.
 * 
 * @author (Marian) 
 * @version (1st. June 2022)
 */
public class Monkey extends Actor
{
    GreenfootSound monkeySound = new GreenfootSound("monkey.wav");
    GreenfootImage[] idlea = new GreenfootImage[8];
    GreenfootImage[] idled = new GreenfootImage[8];
    GreenfootImage rightImage = new GreenfootImage("images/monkey1.png");
    GreenfootImage leftImage = new GreenfootImage("images/monkey1.png");
    
    //make a mirror monkey 
    {
        leftImage.mirrorHorizontally();
    }
    String facing = "a";
    /**
     * animate the monkey
     */
    int imageIndex = 0;
    public void animateMonkey()
    {
        if(facing.equals("a"))
        {
            setImage(idlea[imageIndex]);
            imageIndex = (imageIndex + 1) % idlea.length;
        }
        else
        {
            setImage(idled[imageIndex]);
            imageIndex = (imageIndex + 1) % idled.length;
        }
    }
    /** 
     * Act - do whatever the Monkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //moving monkey.
        if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
            facing = "a";
            setImage(leftImage);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(3);
            facing ="d";
            setImage(rightImage);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(this.getX(), this.getY()-3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(this.getX(), this.getY()+3);
        }
        
        
        
        //move banana if monkey eat it
        eat();
    }
    /**
     * spawn a new banana if banana has been eaten.
     */
    public void eat()
    {
        if(isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            MyWorld world =(MyWorld) getWorld();
            world.createBanana();
            world.increaseScore();
            monkeySound.play();
        }
    }
    
}
