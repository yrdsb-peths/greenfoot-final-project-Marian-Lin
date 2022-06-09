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
    
    private void prepare()
    {
        Monkey monkey = new Monkey();
        addObject(monkey,479,87);
        monkey.setLocation(494,87);
        Label label = new Label("Use <a - and - d> to Move",40);
        addObject(label,220,257);
        label.setLocation(297,243);
        label.setLocation(305,240);
        Label label2 = new Label("Press<space> to Start",40);
        addObject(label2,249,331);
        label2.setLocation(326,319);
        label.setLocation(328,253);
        label2.setLocation(295,326);
        label.setLocation(278,261);
    }
}
