package server;


import java.util.List;

public class PokerHand{
    private HandType handType;
    private List<Card> cards;
    private Player player;

    public PokerHand(final HandType handType, final List<Card> cards, final Player player) {
	this.handType = handType;
	this.cards = cards;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public List<Card> getCards() {
	return cards;
    }

    public int getHandStrength() { return handType.getValue(); }
}
