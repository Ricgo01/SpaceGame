import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class badguy extends Actor
{
   
    private int vx=0;
    private boolean toRemove=false;
    
    public badguy()
    {
        
    }
    
    public badguy(int v)
    {
       vx=v; 
    }
    
    public void addedToWorld(World MyWorld)
    {
        setRotation(180);
    }
    
    public void move()
    {
        setLocation(getX()+vx,getY());
        Actor actor=getOneIntersectingObject(ship.class);
        if(actor!=null){
            ((ship)actor).Hancur();
            Hancur();
        }
        if(getX()<200)toRemove=true;
    }
    
    public void Hancur()
    {
        for(int i=0;i<10;i++){
            int px=-20+Greenfoot.getRandomNumber(40);
            int py=-20+Greenfoot.getRandomNumber(40);
            getWorld().addObject(new Pecahan(getImage()),getX()+px,getY()+py);
        }
        getWorld().addObject(new Bundaran(),getX(),getY());
        toRemove=true;
    }
    
    public void act()
    {
       if (!toRemove)move();
       else{
           getWorld().removeObject(this);
       }
    }
}
