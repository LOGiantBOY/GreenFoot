import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class players extends movers
{
    /**
     * Act - do whatever the players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public void youWin()
    {
     if(isTouching(winPlatform.class))
     {
         getWorld().addObject(new youWinScreen(),getWorld().getWidth()/2,getWorld().getHeight()/2); 
         Greenfoot.stop();
        }
         
    }

}
