package pkg360sandbox3;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pkg360sandbox3.Game;
/**
 * @author reyob
 */
public class Hibernate {
    private HibernateUtil1 helper;
    private Session sesion;
    private Game gameon;
    private List<Game> games;
    
    public void main() {
        sesion = HibernateUtil1.getSessionFactory().openSession();
        gameon = new Game();
        gameon.setGameName("Risk");
        add_game(gameon);
        get_all_games();
        modify_Game();
        sesion.close();
    }
    
    private void add_game(Game game){
        sesion.beginTransaction();
        sesion.save(game);
        sesion.getTransaction().commit();
    }  //end add_game
    
    private void get_all_games(){
        Transaction transaction = sesion.beginTransaction();
        org.hibernate.Query allGamesQuery = sesion.createQuery("select g from Game as g order by g.id");
        games = allGamesQuery.list();
        System.out.println("\n\nNumber of games: " + games.size());
        Iterator<Game> iter = games.iterator();;
        while(iter.hasNext()) {
            Game element = iter.next();
            System.out.println(element.getGameName());
        }
        transaction.commit();
    } //end get_all_games()
    
    private void modify_Game(){
        Transaction transaction = sesion.beginTransaction();
        org.hibernate.Query singleGamesQuery = sesion.createQuery("select g from Game as g where g.gameName ='Risk'");
        Game thisGame = (Game)singleGamesQuery.uniqueResult();
        String new_name = thisGame.getGameName() + "_" + thisGame.getGameId();
        thisGame.setGameName(new_name);
        sesion.merge(thisGame);
        transaction.commit();
        get_all_games();
    } //end modify_Game()
}
