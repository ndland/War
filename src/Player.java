import java.util.Queue;

/**
 * Created by nick on 6/30/16.
 */
public class Player {

    private Queue<Card> playerCards;
    private String playerName;

    Player(String name) {
        playerName = name;
    }

    public Queue<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(Queue<Card> playerCards) {
        this.playerCards = playerCards;
    }
}
