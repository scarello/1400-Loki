
public class Card {
    private String face;
    private String suit;
    priavte int value;

    //Constructor gets things set up
    public Card ( String cardFace, String cardSuit ) 
    {
        face = cardFace;
        suit = cardSuit;
        value = cardValue;
    }
        // toString () gets a String representation of object
        public String toString()
        {
            return face + “ of “ + suit;
        }
       //will retrun a numeric value
        public int getCardValue()
        {
            return value;
        }

    }

