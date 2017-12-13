package pkg360sandbox3;
/**
 * @author reyob
 */

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  

@Entity
public class Game {
    private int gameId;
    private String gameName;
    
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @Column(name="game_id")
    public int getGameId()
    {
        return gameId;
    }
    public void setGameId(int gameId)
    {
        this.gameId = gameId;
    }
    
    @Column(name="game_name")
    public String getGameName()
    {
        return gameName;
    }
    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }
    
}
