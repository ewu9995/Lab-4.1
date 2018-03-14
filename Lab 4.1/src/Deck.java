import java.util.ArrayList;

public class Deck {
 
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;
	
	public Deck(String[] ranks, String[] suits, int[] value) {
		for(int i=0; i<ranks.length; i++) {
			for(int j =0; j <suits.length;j++) {
				unDealt.add(new Card(ranks[i], suits[j], value[i]));
			}
		}
	}
	
	public boolean isEmpty(ArrayList<Card> unDealt ) {
		if(unDealt.size() == 0) {
			return true;
		}
		return false;
	}
	
	public int size(ArrayList<Card> Dealt ) {
		return unDealt.size();
		
	}
	
	public ArrayList deal(ArrayList<Card> UnDealt) {
		
		return UnDealt;
	}
	 
	
	
	
	
}
