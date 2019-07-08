import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class rocket extends Actor
{
    // instance variables
    int movespeed = 4;
    int turnspeed = 4;
    int weaponCooldown = 0;
    
    public void act() 
    {
        movement();
        shooting();
        weaponCooldown--;
    }    
    
    
    
    public void movement()
    {
       if(Greenfoot.isKeyDown("w")) //up
        move(movespeed);
       
       if(Greenfoot.isKeyDown("a")) // left
        turn(-turnspeed);
       
       if(Greenfoot.isKeyDown("d")) // right
        turn(turnspeed);
        
       if(Greenfoot.isKeyDown("s")) // down
        move(-movespeed/2);
        
       int width = getWorld().getWidth();
       int height = getWorld().getHeight();
       int x = this.getX();
       int y = this.getY();
       
       
       // ------------------------------------------------
       if(x < 0) //exiting of left of screen
        setLocation(width-1,y);
        
       if(x > width-1) //exiting of right of screen
        setLocation(0,y);
        
       if(y < 0) //exiting of top of screen
        setLocation(x, height-1);
        
       if(y > height-1) //exiting of bottom of screen
        setLocation(x,0); 
      
    }
    
     
    public void shooting(){
        if(Greenfoot.isKeyDown("space") && weaponCooldown <=0){
        ammo shot = new ammo(); // create ammo object
        
        getWorld().addObject(shot, getX(), getY()); //ad laser to the world using rocket location
        
        shot.setRotation(this.getRotation()); //set rotation of laser to the ship's
        
        weaponCooldown = 12;
        }
    }
    
    public void collision(){
        
        asteroid crash; 
        crash = (asteroid)getOneIntersectingObject(asteroid.class);
        
        // if crash != null
        
        // if rocketHealth <= 0
        
        
    }
}
