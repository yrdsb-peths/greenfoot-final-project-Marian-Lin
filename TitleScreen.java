import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  TitleScreen
 * 
 * @author (Marian) 
 * @version (1st, June 2022)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Monkey",60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel,getWidth()/2,getHeight()/2);
        prepare();
    }
    /**
     * The main world act loop
     */
    public void act()
    {
        //Start the game if user press the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    //display the rules of this game
    private void prepare()
    {
        Monkey monkey = new Monkey();
        addObject(monkey,479,87);
        monkey.setLocation(494,87);
        Label label = new Label("      Use <a - and - d> to Move Left and Right",40);
        addObject(label,220,257);
        label.setLocation(300,220);
        label.setLocation(100,233);
        Label label2 = new Label("Use <w - and - s> to Move Up and Down",40);
        addObject(label2,220,257);
        label2.setLocation(300,319);
        label.setLocation(328,253);
        Label label3 = new Label("Press<space> to Start",40);
        addObject(label3,249,331);
        label3.setLocation(285,370);
        label.setLocation(273,270);
    }
}
