
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
		if(this.rank.equals(otherCard.rank) && this.suit.equals(otherCard.suit) && (this.pointValue == otherCard.pointValue)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return rank+" " +suit+ " " + pointValue;
		
	}
}
