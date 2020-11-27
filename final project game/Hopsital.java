import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hopsital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hopsital extends World
{
    GreenfootSound hMusic = new GreenfootSound("Hospital soundtrack.wav");
    /**
     * Constructor for objects of class Hopsital.
     * 
     */
    public Hopsital()
    {
        super(900, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,726,554);
        Door door = new Door(0);
        addObject(door,99,551);
        Zombie zombie = new Zombie();
        addObject(zombie,243,550);
        Zombie zombie2 = new Zombie();
        addObject(zombie2,335,552);
        Zombie zombie3 = new Zombie();
        addObject(zombie3,421,551);
    }
    public void act()
    {
        hMusic.play();
    }
    public void started()
    {
     hMusic.playLoop();   
    }
    public void stopped()
    {
     hMusic.stop();   
    }
    
}
