import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab, 231, 203);                      // Crab 1마리 (231, 203) 좌표에 추가
      
        Worm worms[] = new Worm[10];
        for(int i =0; i< 10; ++i){
            worms[i] = new Worm();
              
            int x = Greenfoot.getRandomNumber(560);     //x랜덤 좌표
            int y = Greenfoot.getRandomNumber(560);     //y랜덤 좌표
            
            addObject(worms[i], x, y);
        }                                               // Worm 10마리 랜덤 좌표에 추가
        
        // Lobster 3마리 추가
        // 각 좌표는 (334, 65), (481, 481), (79, 270)
        Lobster lobster[] = new Lobster[3];
        
        lobster[0] = new Lobster();
        lobster[1] = new Lobster();
        lobster[2] = new Lobster();
        
        addObject(lobster[0], 334, 65);
        addObject(lobster[1], 481, 481);
        addObject(lobster[2], 79, 270);
        
        // 100을 세고 움직이는 Turtle 추가
        // 좌표는 랜덤
        
        Turtle turtle = new Turtle(100);
        
        int x = Greenfoot.getRandomNumber(560);
        int y = Greenfoot.getRandomNumber(560);
        
        addObject(turtle, x, y);
        
    }
}
