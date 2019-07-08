   import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class asteroid extends Actor
{
    int speed = 2;
    int health = 3;
    
    // constructor
    public void asteroid(){
        
        int randomRotation = Greenfoot.getRandomNumber(360);
        setRotation(randomRotation);
    
        speed = Greenfoot.getRandomNumber(3)+1;
        
        
    }
    
 
    public void act() 
    {
         
       int width = getWorld().getWidth();
       int height = getWorld().getHeight();
       int x = this.getX();
       int y = this.getY();
       
       if(x < 0) //exiting of left of screen
        setLocation(width-1,y);
        
       if(x > width-1) //exiting of right of screen
        setLocation(0,y);
        
       if(y < 0) //exiting of top of screen
        setLocation(x, height-1);
        
       if(y > height-1) //exiting of bottom of screen
        setLocation(x,0); 
       
       asteroid();
       checkAmmo();
    }    
    
    public void checkAmmo()
    {
        ammo hit; 
        hit = (ammo)getOneIntersectingObject(ammo.class);
        
        if(hit!=null){ // if hit is not empty, htne laser is hitting you
            health = health - hit.getPower();
            getWorld().removeObject(hit);
        }
        
        if(health<=0)
            getWorld().removeObject(this); // if no health left, delete the asteroid
    }
}
