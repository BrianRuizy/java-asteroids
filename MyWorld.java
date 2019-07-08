import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, false); //false lets you go beyond world boundaries, default = true
        
        addObject(new rocket(), 400, 250);
        
        addObject(new asteroid(), 500, 250);
        addObject(new asteroid(), 100, 150);
        addObject(new asteroid(), 300, 250);
        addObject(new asteroid(), 400, 450);
    }
}
