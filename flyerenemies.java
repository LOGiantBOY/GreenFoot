import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flyerenemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flyerenemies extends enemies
{
    /**
     * Act - do whatever the flyerenemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public flyerenemies()
    {
        getImage().scale(getImage().getWidth()/4,getImage().getHeight()/4);
    }
    public void act() 
    {
        move(2);
        wrapEdge();
    }    
}
