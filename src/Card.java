import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by nick on 6/30/16.
 */
public class Card {

    private List<String> deckOfCards = new ArrayList<String>();
    private String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String[] cardSuit = {"D", "H", "S", "C"};

    public List<String> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(List<String> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public List<String> shuffle() {
        for (String suit : cardSuit) {
            for (String value : cardValues) {
                deckOfCards.add(value + suit);
            }
        }

        Collections.shuffle(deckOfCards, new Random());
        return deckOfCards;
    }
}
