package Game;

import java.util.Random;

public class Roll 
{
    private Random roll;
    public void Roll()
    {
        roll = new Random();
    }
    public int d2()
    {
        int num = 0;
        num = roll.nextInt(2)+1;        
        return num;
    }
    public int d4()
    {
        int num = 0;
        num = roll.nextInt(4)+1;        
        return num;
    }
    public int d6()
    {
        int num = 0;
        num = roll.nextInt(6)+1;        
        return num;
    }
    public int d8()
    {
        int num = 0;
        num = roll.nextInt(8)+1;        
        return num;
    }
    public int d10()
    {
        int num = 0;
        num = roll.nextInt(10)+1;        
        return num;
    }
    public int d12()
    {
        int num = 0;
        num = roll.nextInt(12)+1;        
        return num;
    }
    public int d20()
    {
        int num = 0;
        num = roll.nextInt(20)+1;        
        return num;
    }
    public int ID()
    {
        int num = 0;
        num = (roll.nextInt(9))*10000 + roll.nextInt(10000);
        return num;
    }
    
} // End Roll
