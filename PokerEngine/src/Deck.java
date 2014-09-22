import java.util.ArrayList;
import java.util.Collections;

public class Deck 
{
	private ArrayList<Card> deck = new ArrayList<Card>();
	private static final String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private static final int CardsInSuit  = 13;
	private static final int NumOfSuits = 4;
	private static int CardsInDeck = CardsInSuit * NumOfSuits;
	
	public Deck()
	{
		for(int suit = 0; suit < NumOfSuits; suit++)
		{
			for(int value = 1; value <= CardsInSuit; value++)
			{
				addCard(new Card(value, Suits[suit]));
			}
		}
	}
	
	public void addCard (Card card)
	{
		deck.add(card);
	}
	
	public Card getCard(int i)
	{
		return (Card)deck.get(i);
	}
	
	public int getSize()
	{
		return deck.size();
	}
	
	public void shuffle()
	{
		int swapI1 = (int)Math.floor(Math.random() * 52);
			if (swapI1 == 52) 
				swapI1--;
		int swapI2 = (int)Math.floor(Math.random() * 52);
			if (swapI2 == 52) 
				swapI2--;
			
		Collections.shuffle(deck);
	}
	
	public Card dealCard()
	{
		return (Card)deck.remove(0);
	}
	
	public String toString()
	{
		String deck2 = "";
		for(int x = 1; x <= deck.size(); x++)
		{
			deck2 += "Card " + x + ": " + deck.get(x - 1) + "\n";
		}
		return deck2;
	}

	
}
