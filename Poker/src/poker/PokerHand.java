package poker;

import java.util.ArrayList;
import java.util.List;

public class PokerHand{
    private HandType handType;
    private List<Card> cards;
    private int handStrength;
    private Player player;

    public PokerHand(final HandType handType, final List<Card> cards, final Player player) {
	this.handType = handType;
	this.cards = cards;
        this.player = player;
        handStrength = handType.getValue();
    }

    public PokerHand(){
        cards = new ArrayList<>();
    }

    public HandType getHandType() {
	return handType;
    }

    public Player getPlayer() {
        return player;
    }

    public List<Card> getCards() {
	return cards;
    }

    public int getHandStrength() { return handStrength; }
}
