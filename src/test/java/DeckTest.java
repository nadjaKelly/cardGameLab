import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void deckShouldStartEmpty(){
        assertEquals(0, deck.numberOfCards());
    }

    @Test
    public void deckCanAddCardToList(){
        deck.addCard(card);
        assertEquals(1, deck.numberOfCards());
    }

    @Test
    public void deckCanMakeCard(){
        Card card = deck.makeCard();
        deck.addCard(card);
        assertEquals(1, deck.numberOfCards());
    }

    @Test
    public void deckHas52Cards(){
        deck.makeCardset();
        deck.shuffle();
        assertEquals(52, deck.numberOfCards());
    }

    @Test
    public void deckCanDealCard(){
        deck.makeCardset();
        deck.dealCard();
        assertEquals(51, deck.numberOfCards());
        assertEquals(1, deck.numberOfDealtCards());
    }
}
