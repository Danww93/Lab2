
public class Play 
{
	private static final int HandSize = 5;
	private Deck deck = new Deck();
	private Hand hand;
	
	public static void main(String[] args)
	{
		FiveCards game = new FiveCards();
		
		game.showDeck();
		game.shuffleDeck();
		game.showHand();
		
		System.out.println("Dealing hand... \n");
		game.dealNewHand();
		game.showHand();
		game.gradeHand();
	}
	
	public void showHand()
	{
		if(hand != null)
		{
			System.out.println("Current hand: \n");
			System.out.println(hand);
		}
		else
			System.out.println("A hand has not been dealt yet. \n");
		
	}
	
	public void shuffleDeck()
	{
		deck.shuffle();
	}
	
	public void dealNewHand()
	{
		hand = new Hand();
		for(int x = 0; x < HandSize; x++)
		{
			hand.addCard(deck.dealCard());
		}
	}
	
	public void gradeHand()
	{
		System.out.println(hand.getGrade());
	}
	
	
}

