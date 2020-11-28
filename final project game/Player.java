import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int firingRate = 20;
    private int firingCounter = 0;
    private final int grav = 1;
    private int velo = 4; //velocity
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(){
        velo = 0;
    }
    public void act() 
    {
        move();
        shoot();
        fall();
        if (Greenfoot.isKeyDown("j") && 
        getY() > getWorld().getHeight() -30) jump();
    } 
    public void move() {
        if (Greenfoot.isKeyDown("a")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("j")){
            jump();
        }    
    }
    
    public void shoot() {
        if (Greenfoot.isKeyDown("space")) {
            firingCounter++;
            if (firingCounter == firingRate) {
                World world = getWorld();
                world.addObject(new Bullet(), getX(), getY());
                firingCounter = 0;
            }
        }
    }
    public void jump(){
     velo=-10;   
    }    
    public void fall(){
        setLocation(getX(),getY() + velo);
        if (getY() > getWorld().getHeight() - 30) velo = 0;
        else velo += grav;
    }
}