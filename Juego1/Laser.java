import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Laser extends Actor
{
    private boolean toRemove=false;
    private int vx=3;
    
  
    public void addedToWorld(World MyWorld)
    {
       
    }
    public void act()
    {
        if(!toRemove){
           setLocation(getX()+vx,getY()); 
           Actor actor=getOneIntersectingObject(badguy.class);
           if(actor!=null){
               ((badguy)actor).Hancur();
           }
           if(getX()>getWorld().getWidth()+200)toRemove=true;
        }else{
            getWorld().removeObject(this);
        }
        
        
    }
}
