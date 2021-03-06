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
        cards.add(new Card(Rank.Rank_10, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_2, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_3, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_4, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_5, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_6, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_7, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_8, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_9, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_Ace, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_King, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_Jack, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_Queen, Suits.Diamonds));
        cards.add(new Card(Rank.Rank_10, Suits.Clubs));
        cards.add(new Card(Rank.Rank_2, Suits.Clubs));
        cards.add(new Card(Rank.Rank_3, Suits.Clubs));
        cards.add(new Card(Rank.Rank_4, Suits.Clubs));
        cards.add(new Card(Rank.Rank_5, Suits.Clubs));
        cards.add(new Card(Rank.Rank_6, Suits.Clubs));
        cards.add(new Card(Rank.Rank_7, Suits.Clubs));
        cards.add(new Card(Rank.Rank_8, Suits.Clubs));
        cards.add(new Card(Rank.Rank_9, Suits.Clubs));
        cards.add(new Card(Rank.Rank_Ace, Suits.Clubs));
        cards.add(new Card(Rank.Rank_King, Suits.Clubs));
        cards.add(new Card(Rank.Rank_Jack, Suits.Clubs));
        cards.add(new Card(Rank.Rank_Queen, Suits.Clubs));
        cards.add(new Card(Rank.Rank_10, Suits.Spades));
        cards.add(new Card(Rank.Rank_2, Suits.Spades));
        cards.add(new Card(Rank.Rank_3, Suits.Spades));
        cards.add(new Card(Rank.Rank_4, Suits.Spades));
        cards.add(new Card(Rank.Rank_5, Suits.Spades));
        cards.add(new Card(Rank.Rank_6, Suits.Spades));
        cards.add(new Card(Rank.Rank_7, Suits.Spades));
        cards.add(new Card(Rank.Rank_8, Suits.Spades));
        cards.add(new Card(Rank.Rank_9, Suits.Spades));
        cards.add(new Card(Rank.Rank_Ace, Suits.Spades));
        cards.add(new Card(Rank.Rank_King, Suits.Spades));
        cards.add(new Card(Rank.Rank_Jack, Suits.Spades));
        cards.add(new Card(Rank.Rank_Queen, Suits.Spades));
        cards.add(new Card(Rank.Rank_10, Suits.Hearts));
        cards.add(new Card(Rank.Rank_2, Suits.Hearts));
        cards.add(new Card(Rank.Rank_3, Suits.Hearts));
        cards.add(new Card(Rank.Rank_4, Suits.Hearts));
        cards.add(new Card(Rank.Rank_5, Suits.Hearts));
        cards.add(new Card(Rank.Rank_6, Suits.Hearts));
        cards.add(new Card(Rank.Rank_7, Suits.Hearts));
        cards.add(new Card(Rank.Rank_8, Suits.Hearts));
        cards.add(new Card(Rank.Rank_9, Suits.Hearts));
        cards.add(new Card(Rank.Rank_Ace, Suits.Hearts));
        cards.add(new Card(Rank.Rank_King, Suits.Hearts));
        cards.add(new Card(Rank.Rank_Jack, Suits.Hearts));
        cards.add(new Card(Rank.Rank_Queen, Suits.Hearts));


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
