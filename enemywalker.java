import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemywalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemywalker extends enemies
{
    /**
     * Act - do whatever the enemywalker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    int speed = 2;
    public enemywalker(boolean upAndDown)
    {
        getImage().scale(getImage().getWidth()/6,getImage().getHeight()/6);
        upDown = upAndDown;
    }
    public void act() 
    {
        walkAround();
       enemieHitWalls();
    }   
    public void enemieHitWalls()
    {
         if (hitWalls())
        {
          speed = -speed;  
        }
    }
    private void walkAround()
    {
        int x = getX();
        int y = getY();
        if(upDown)
        {
        
        setLocation(x,y + speed);
    }
    else if (!upDown)
    {
     setLocation(x + speed,y);
    }
   
    }
}
