
public class Card {
  
	String rank;
	String suit;
	int pointValue;
	
	public Card(String rank, String suit, int pointValue) {
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;	
	}

	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	public int getPointValue() {
		return pointValue;
	}
	
	public boolean equals(Card otherCard) {
		if(rank.equals(otherCard.rank) && suit.equals(otherCard.suit) && (pointValue == otherCard.pointValue)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "card";
		
	}
}
