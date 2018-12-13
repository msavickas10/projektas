package org.cards.poker.holdem;

import org.cards.poker.holdem.cards.Card;
import org.cards.poker.holdem.cards.CardsDeck;
import org.cards.poker.holdem.players.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private CardsDeck deck;

    private List <Player> players;

    public Game() {
        players = new ArrayList<Player>();
    }


    public CardsDeck getDeck() {
        return deck;
    }

    public void setDeck(CardsDeck deck) {
        this.deck = deck;
    }

    public void Startgame() {
        Card card = deck.takeOne();

        deck.takeOne();


        players.get(0).

    }


}
