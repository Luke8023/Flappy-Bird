import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
//import java.awt.Font;

public class Score extends Actor
{
    public Score(){
        GreenfootImage newImage = new GreenfootImage(100, 50);
       
        setImage(newImage);
    }
    
    public void setScore(int score){
        GreenfootImage newImage = getImage();
        newImage.clear();
        greenfoot.Font f = new Font("forte", 36);
        newImage.setFont(f);
        newImage.setColor(greenfoot.Color.WHITE);
       
        newImage.drawString("" + score, 30, 30);
        setImage(newImage);
    }
}
