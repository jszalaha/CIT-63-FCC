package Game;

public class heroManager
{
    final static int MAX_PARTY = 4;
    Hero[] Party;
    
    public void heroManager()
    {
        Party = new Hero[MAX_PARTY]; 
        for(int i=0;i<=MAX_PARTY-1;i++)
        {
            Party[i] = null;
        }
    }
    public void heroManager(heroManager copy)
    {
    }
    
    public boolean isFull()
    {
        boolean success = false;
        if(Party[0] != null && Party[1] != null && Party[2] != null 
                && Party[3] != null)
        {
            success = true;
        }
        return success;
    }
    public boolean isEmpty()
    {
        boolean success = false;
        if(Party[0] == null && Party[1] == null && Party[2] == null 
                && Party[3] == null)
        {
            success = true;
        }        
        return success;
    }
    public boolean addHero(Hero hero)
    {
        boolean success = false;
        int i=0;
        if(!isFull())
        {
            if(isEmpty())
            {
                Party[0] = hero;
                success = true;
            }
            else 
            {
                while(Party[i] != null)
                {
                    i++;
                }
                Party[i] = hero;
                success = true;
            }
        }
        return success;
    }
    public boolean addHero(Hero hero, int index)
    {
        boolean success = false;
        if(Party[index] == null)
        {
            Party[index] = hero;
            success = true;
        }
        return success;
    }
    public void removeHero(Hero hero)
    {
        int i = 0;
        while(Party[i] != hero)
        {
            i++;
        }
        Party[i] = null;       
    }
    public void removeHero(int index)
    {
        Party[index] = null;
    }
    public void moveHero(Hero hero,int index)
    {
        int i = 0;
        Hero temp;
        while(Party[i] != hero)
        {
            i++;
        }
        temp = Party[i];
        Party[i] = Party[index];
        Party[index] = temp;
        temp = null;
    }
    public void moveHero(int hero,int index)
    {
        Hero temp;
        temp = Party[hero];
        Party[hero] = Party[index];
        Party[index] = temp;
        temp = null;
    }    
    
} // End heroManager
