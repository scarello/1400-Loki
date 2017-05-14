import java.util.Scanner;
import java.util.ArrayList;

public class War
{
    public static void main ( String args[] )
    {
        DeckOfCards theDeck = new DeckOfCards();
        theDeck.shuffle();

        ArrayList<Card> myDeck = new ArrayList<Card>();
        ArrayList<Card> yourDeck = new ArrayList<Card>();

        for(int x = 0; x < 26; x ++)
        {
            myDeck.add ( theDeck.dealCard() );
            yourDeck.add ( theDeck.dealCard() );
        }

        int myPoints = 0;
        int yourPoints = 0;

        for ( int battle = 1; battle <= 26; battle++ )
        {
            Card myCard = myDeck.remove(0);
            Card yourCard = youDeck.remove(0);

            int myValue = myCard.getCardValue();
            int yourValue = yourCard.getCardValue();

            System.out.println ( "Battle #" + battle );
            System.out.printf ( "Mine: %s (%d)\nvs.\nYours: %s (%d) \n\n",
                    myCard, myValue, yourCard, yourValue);
        }

        if ( myValue > yourValue )
        {
            System.out.println ("I Win!" );
            myPoints++;
        }
        else if (yourValue> myValue)
        {
            System.out.println ("You Win!");
            yourPoints++;
        }
        else
        {
            System.out.println("Tie");
        }

        System.out.println ( "Battle #" + battle );
        System.out.printf ( "Mine: %s (%d)\nvs.\nYours: %s (%d) \n\n",
                myCard, myValue, yourCard, yourValue);
        
    }
}
