import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class movers extends Actor
{
    int speed = 4;
    /**
     * Act - do whatever the movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public void maxSpeed()
    {
        if (speed >= 7)
        {
            speed = 7;   
        }
    }

    public void moveAndturn()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);    
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);   
            move(4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);   
            move(4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90); 
            move(4);
        }
    }

    public void slideAround()
    { int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x + speed, y);
            if(hitWalls())
            {
                setLocation(x - speed, y); 
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x - speed, y);
            if(hitWalls())
            {
                setLocation(x + speed, y); 
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x , y - speed);
            if(hitWalls())
            {
                setLocation(x , y + speed); 
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x , y + speed);
            if(hitWalls())
            {
                setLocation(x , y - speed); 
            }
        }
    }

    public boolean hitWalls()
    {
        if (isTouching(wals.class))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public void collectBoost()
    {
        if (isTouching(speedboost.class))
        {
            speed++;
            removeTouching(speedboost.class);

        }
    }
    public boolean hitEnemy()
    {
       if(isTouching(enemies.class))
       {
           return true;
        }
        else 
        {
            return false;
        }
    }
}
