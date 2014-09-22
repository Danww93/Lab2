import java.util.ArrayList;

public class Hand 
{
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public void addCard(Card c)
	{
		hand.add(c);
	}
	
	public int getSize()
	{
		return hand.size();
	}
	
	public String toString()
	{
		String myHand = "";
		if(hand.size() == 0)
			return "The hand is empty";
		else
		{
			for(int x = 1; x <= hand.size(); x++)
			{
				myHand += "Card" + x + " : " + hand.get(x-1) + "\n";
			}
				return myHand;
			
		}
	}
	
	public boolean isPair()
	{
		int temp;
		int counter = 0;
		
		for(int x = 0; x < 5; x++)
		{
			temp = hand.get(x).getValue();
			for(int y = 0; y < 5; y++)
			{
				if(x != y)
				{
					
				}
			}
		}
						
	}

}
