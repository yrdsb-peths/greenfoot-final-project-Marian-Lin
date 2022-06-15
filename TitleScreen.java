import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  TitleScreen
 * 
 * @author (Marian) 
 * @version (June 2022)
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
        
        addObject(titleLabel,getWidth()/2,getHeight()/3);
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
        monkey.setLocation(200,75);
        
        Banana banana = new Banana();
        addObject(banana,479,87);
        banana.setLocation(300,75);
        
        Banana banana2 = new Banana();
        addObject(banana2,479,87);
        banana2.setLocation(400,75);
        
        Banana banana3 = new Banana();
        addObject(banana3,479,87);
        banana3.setLocation(500,75);
        
        Label label = new Label("      Use <a - and - d> to Move ",40);
        addObject(label,220,230);
        label.setLocation(276,220);
        
        Label label2 = new Label("  Use <w - and - s> to Move ",40);
        addObject(label2,220,257);
        label2.setLocation(297,260);
        
        Label label3 = new Label("Press<space> to Start",40);
        addObject(label3,249,331);
        label3.setLocation(276,300);
    }
}
