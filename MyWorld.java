import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Marian) 
 * @version (1st, June 2022)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    //SimpleTimer time = new SimpleTimer();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int timer = 1000;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //create the monkey object
        Monkey monkey = new Monkey();
        addObject(monkey,300,200);
        
        //create a label
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,40,40);
        
        createBanana();
    }
    
    //when the time is over, the game is over.
    
    //When time over display gameover
    public void act()
    {
        timer--;
        
        if(timer <= 0)
        {
            Greenfoot.stop();
            gameOver();
            
        }

    }

    /**
     * when the game over, print out "Game Over".
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over",100);
        addObject(gameOverLabel,300,200);
    }
    
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    /**
     * create a new banana at random location at anywhere of the screen.
     */
    public void createBanana()
    {
        Banana banana = new Banana();
        int x =Greenfoot.getRandomNumber(600);
        int y =Greenfoot.getRandomNumber(200);
        addObject(banana,x,y);
    }
}
