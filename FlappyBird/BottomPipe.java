import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BottomPipe extends Actor
{
    int PIPE_SPEED = -4;
    public void act() 
    {
        setLocation( getX() + PIPE_SPEED, getY());
    }    
}
