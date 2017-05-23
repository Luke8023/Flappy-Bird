import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyWorld extends World
{
    int flappyCounter = 0;
    int score = 0;
    Score scoreNum = null;
    int FIRST_PIPE = 230;
    int pipeCounter = 0;
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        // Set paint order
        setPaintOrder(Score.class, GameOver.class, FlappyBird.class, BottomPipe.class, TopPipe.class, Ground.class);
        //create a flappy bird
        FlappyBird flappy = new FlappyBird();
        
        //add ground to our world
        Ground ground = new Ground();
        addObject(ground, getWidth()/2, getHeight()/2 + 180);
        
        //add flappy to our world
        addObject(flappy, 100, getHeight()/2);
        
        //add score to our world
        scoreNum = new Score();
        scoreNum.setScore(0);
        addObject(scoreNum, getWidth()/2, getHeight()/2 - 150);
      
        
    }
    
    
    
    public void act() {
        pipeCounter++;
        
        if (pipeCounter % 100 == 0) {
            int RANDOM_HEIGHT = Greenfoot.getRandomNumber(255);
            BottomPipe botpipe = new BottomPipe();
            TopPipe toppipe = new TopPipe();
            GreenfootImage image = botpipe.getImage();
            GreenfootImage image2 = toppipe.getImage();
            addObject(botpipe, getWidth(), getHeight()/2 + image.getHeight() + 60 - RANDOM_HEIGHT);
            addObject(toppipe, getWidth(), getHeight()/2 - image.getHeight() + 200 - RANDOM_HEIGHT);
           
        }
        
        if (pipeCounter >= FIRST_PIPE) {
            if(flappyCounter % 100 == 0){
                score++;
                scoreNum.setScore(score);
            }
            flappyCounter++;
        }
    }
}
