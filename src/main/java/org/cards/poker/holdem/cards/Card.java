package org.cards.poker.holdem.cards;

public class Card {

    private Rank rank;
    private Suits suits;

    public Card(Rank rank, Suits suits) {
        this.rank = rank;
        this.suits = suits;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suits getSuits() {
        return suits;
    }

    public void setSuits(Suits suits) {
        this.suits = suits;
    }



}
