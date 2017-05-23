import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 0.4;
    double BOOST_SPEED = -6;
    //GreenfootImage upwing;
    //GreenfootImage midwing;
    //GreenfootImage downwing;
    
    //public FlappyBird(){
        
        
        
    //}
    public void act(){
        
      setLocation( getX(), (int)(getY() + dy));
      
      if (getOneIntersectingObject(BottomPipe.class) != null){
          displayGameOver();
      }
        
      if (getOneIntersectingObject(TopPipe.class) != null){
          displayGameOver();
      }      
      //if user pres up, then boost upword
      
      if(Greenfoot.isKeyDown("space") == true){
          dy = BOOST_SPEED;
      }
        
      if (dy > 10){
          setRotation(60);
        }
        else if (dy > 2){
            setRotation(30);
        }
        else if (dy > 0){
            setRotation(10);
        }
        else if (dy > -2){
            setRotation(-10);
        }
        else if (dy > -10){
            setRotation(-30);
        } else {
            setRotation(-60);
        }
        
      if(getY() > getWorld().getHeight()) {
          displayGameOver();
      }
        
      dy = dy + g;
      
      
    }
    private void displayGameOver(){
          GameOver gameOver = new GameOver();
          getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
          Greenfoot.stop();
        }
}
