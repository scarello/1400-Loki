import java.util.Random;

public class DeckOfCards
{

    private Card deck[]; //array of Card objects
    private int currentCard; //next to be dealt
    private final int NUM_OF_CARDS = 52;
    private Random randoms;

    public DeckOfCards()
    {
        String faces[] = { "Deuce", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace" };
        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card [ NUM_OF_CARDS ];
        currentCard = 0;
        randoms = new Random();

        for ( int a = 0; a < deck.lenght; a++)
            deck [a] = new Card( faces[a%13], suits[a/13], a%13 );

    }
    public void shuffle()
    {
        currentCard = 0;
        for ( int first = 0; first < deck.length; first++)
        {
            int second = randoms.nextInt ( NUM_OF_CARDS );
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    
    public Card dealCard()
    {
        Card whichOne;
        if ( currentCard < deck.length)
            whichOne = deck[currentCard++];
        else 
            whichOne = null;
        return whichOne;
    }


}



