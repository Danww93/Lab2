
public class Card 
{
	private String suit;
	private int value;
	
	public Card(int value, String suit)
	{
		this.value = value;
		this.suit = suit;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public String toString()
	{
		String strValue ="";
		if (value == 11)
			strValue = "Jack";
		else if (value == 12)
			strValue = "Queen";
		else if (value == 13)
			strValue = "King";
		else if (value == 1)
			strValue = "Ace";
		else
			strValue = String.valueOf(value);
		
		return strValue + " of " + suit;
	}
}
