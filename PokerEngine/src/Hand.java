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
	
	public boolean Pair()
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
					if(temp == hand.get(y).getValue());
					{
						counter++;
					}
				}
				
				if(counter == 2)
				{
					return true;
				}
			}
		}
			return false;			
	}
	
	public boolean ThreeOfAKind()
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
					if(temp == hand.get(y).getValue());
					{
						counter++;
					}
				}
				
				if(counter == 3)
				{
					return true;
				}
			}
		}
			return false;
		
	}
	
	public boolean Flush()
	{
		 
		String suit = hand.get(0).getSuit(); 
		 for (int i = 1; i < 5; i++)
		 { 
			if (!suit.equals(hand.get(i).getSuit())) 
			{ 
				return false; 
			}
		 } 
		return true;
		 


	}
	
	public boolean FourOfAKind()
	{
		
	}

}
