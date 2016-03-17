package Game;

public class Bard extends Hero
{
    Roll roll = new Roll();
    public void Bard()
    {
        Level = 1;
        HP = roll.d6() + (Level*Abs.CON);
        MP = 0;
        BAbonus = 0;
        Fort = 0;
        Ref = 2;
        Will = 2;
        Name = "";
        Voc = Vocation.BARD;
        Race = null;        
    }
    public void Bard(String newname,Races race)
    {
        Level = 1;
        HP = roll.d6() + (Level*Abs.CON);
        MP = 0;
        BAbonus = 0;
        Fort = 0;
        Ref = 2;
        Will = 2;
        Name = changeHeroName(newname);
        Voc = Vocation.BARD;
        Race = race;        
    }
    public void Bard(int level,String newname,Races race)
    {
        Level = level;
        HP = roll.d6() + (Level*Abs.CON);
        MP = 0;
        BAbonus = (level-1) + (Math.max(Abs.DEX-1,0));
        Fort =(level-1) + (Math.max(Abs.CON-1,0));
        Ref = (level+1) + (Math.max(Abs.DEX-1,0));
        Will = (level+1) + (Math.max(Abs.CHA-1,0));
        Name = changeHeroName(newname);
        Voc = Vocation.BARD;
        Race = race;
    }
    public void Bard(Bard bard,String newname)
    {
        
    }
    
} // End Bard
