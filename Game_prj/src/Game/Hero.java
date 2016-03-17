package Game;

public class Hero 
{
    protected enum Vocation{
        BARD,
        CLERIC,
        MAGE,
        RANGER, 
        ROGUE,
        WARRIOR        
    };
    protected enum Races{
        HUMAN,
        DWARF,
        ELF,
        GNOME,
        HALF_ELF,
        HALF_ORC,
        HALFLING
    };
    
    protected Ability Abs= new Ability();
    protected long[] EXP = new long[2];
    protected int Level;
    protected int HP;
    protected int MP;
    protected int BAbonus;
    protected int Fort;
    protected int Ref;
    protected int Will;
    protected String Name;
    protected Vocation Voc;
    protected Races Race;   
    
    protected class Ability
    {
        protected int Strength;
        protected int Dexterity;
        protected int Constitution;
        protected int Intelligence;
        protected int Wisdom;
        protected int Charisma;
        protected int STR;
        protected int DEX;
        protected int CON;
        protected int INT;
        protected int WIS;
        protected int CHA;
        
        public void Ability()
        {
            Strength=Dexterity=Constitution=Intelligence=Wisdom=Charisma=10;
            STR=DEX=CON=INT=WIS=CHA=0;
        } // End Ability()
    } // End Ability
    
    /*public int hurtHP(int mod)
    {
        HP += mod;
        return HP;
    } // End hurtHP
    public int healHP(int mod)
    {
        HP -= mod;
        return HP;
    } // End healHP
    public int gainMP(int mod)
    {
        MP += mod;
        return MP;
    } // End gainMP
    public int loseMP(int mod)
    {
        MP -= mod;
        return MP;
    } // End loseMP
    */
    public String changeHeroName(String newname)
    {
        Name = newname;
        return Name;
    } // End changeName
    
    public void levelUp()
    {
        
    }
   
} // End Hero
