import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beach extends World
{
    GreenfootSound bMusic = new GreenfootSound("creepy beach song.wav");
    /**
     * Constructor for objects of class Beach.
     * 
     */
    public Beach()
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
        Door door = new Door(3);
        addObject(door,116,529);
        Player player = new Player();
        addObject(player,705,528);
    }
    public void act()
    {
        bMusic.play();
    }
    public void started()
    {
        bMusic.playLoop();
    }
    public void stopped()
    {
        bMusic.stop();
    }   
}
