import java.util.Arrays;
import java.util.List;

/**
 * Created by nick on 6/30/16.
 */
public class Runner {

    public static void main(String[] args) {
        Card cards = new Card();
        List<String> deckOfCards = cards.shuffle();
        String[] allCards = deckOfCards.toArray(new String[deckOfCards.size()]);

        Player playerOne = new Player("Nick");
    }
}
