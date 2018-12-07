package org.cards.poker.holdem.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardsDeck {

    private List<Card> cards = new ArrayList<Card>();

    public CardsDeck() {

        reset();

    }

    public void reset() {
        cards.add(new Card(Rank.Rank_2, Suits.Diamonds));
        //TODO
    }

    public  Card takeOne() {
        Random random = new Random();
        int randomIndex =  random.nextInt(cards.size());

        return cards.remove(randomIndex);


    }


    public List<Card> getCards() {
        return cards;
    }


}
