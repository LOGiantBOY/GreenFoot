import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends players
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mazeRunnerlives;
    // create methode
    public MazeRunner(int lives)
    {
        getImage().scale(getImage().getWidth()/55,getImage().getHeight()/55);
        mazeRunnerlives = lives;
    }

    public void act() 
    {
        // Add your action code here.
        slideAround();
        collectBoost();
        maxSpeed();
        loseLife();
        mazeRunnerhit();
        youWin();
        youLose();

    }   

    public void mazeRunnerhit()
    {
        if (hitEnemy())
        {
            setLocation(50,570);
        }
    }

    public void loseLife()
    {
        if (hitEnemy())
        {
            mazeRunnerlives--;
        }
    }

    public void youLose()
    {
        if(mazeRunnerlives == 0)
        {
            getWorld().addObject(new YouLose(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
