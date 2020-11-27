import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends World
{
    GreenfootSound fMusic = new GreenfootSound("Forest soundtrack.wav");
    /**
     * Constructor for objects of class Forest.
     * 
     */
    public Forest()
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
        addObject(player,754,355);
        Door door = new Door(2);
        addObject(door,145,352);
    }
    public void act()
    {
        fMusic.play();
    }
    public void started()
    {
        fMusic.playLoop();
    }
    public void stopped()
    {
        fMusic.stop();
    }
}
