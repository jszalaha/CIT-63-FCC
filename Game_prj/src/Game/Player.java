package Game;

public class Player 
{
    private String Name;
    private int Player_ID;
    Roll roll = new Roll();
    heroManager myHeroManager;
    
    public void Player()
    {
        Name = "";
        Player_ID = roll.ID();
        myHeroManager = new heroManager();
    }
    public void Player(String name)
    {
        Name = name;
        Player_ID = roll.ID();
        myHeroManager = new heroManager();
    }
    public void Player(Player player)
    {
        this.Name = player.Name;
        this.Player_ID = player.Player_ID;
        this.myHeroManager = player.myHeroManager;
    }
    public String changePlayerName(String newname)
    {
        String name = newname;
        return name;
    }
    
} // End Player
