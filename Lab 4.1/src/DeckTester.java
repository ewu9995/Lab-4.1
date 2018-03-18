/*
 * Evan Wu
 * Lab 4.1
 * AP CSA Period 2
 */

public class DeckTester {
	public static void main(String[] args){
		String suits[] = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String ranks[] = {"Ace", "Jack", "King", "Queen", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		int pointValue [] = {2,3,4,5,6,7,8,9,10,11,12,13,14}; 
		
		Deck cardDeck = new Deck(ranks,suits,pointValue);
		cardDeck.shuffle();
		System.out.print(cardDeck.deal());
		
	}
}
