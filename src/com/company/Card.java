package com.company;

/**
 * Created by student4 on 09.11.16.
 */
public class Card {
    Suit suit;
    Value value;
            public Card(Suit suit,Value value)
            {
                this.suit = suit;
                this.value = value;

            }
            @Override
    public String toString()
            {
                return "" + value + " of " + suit;

            }
}
