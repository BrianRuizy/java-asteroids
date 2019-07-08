import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ammo extends Actor
{
      
    int speed = 8;
    int power = 1;
    int decayTimer = 60; // frames until it dissapears
    
   
    public void act() 
    {
       move(speed);
       decayTimer--;  //decrement timer to decay
       
       if (decayTimer <=0)
        getWorld().removeObject(this);
       
       else {
           if(isAtEdge())
            getWorld().removeObject(this);
       }
       
       
    }   
    
    public int getPower(){
        
        return power;
    }
}
