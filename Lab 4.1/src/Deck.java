import java.util.ArrayList;

public class Deck {
 
	ArrayList<Card> unDealt = new ArrayList<Card>();
	ArrayList<Card> Dealt = new ArrayList<Card>();
	
	public Deck(String[] ranks, String[] suits, int[] value) {
		for(int i=0; i<ranks.length; i++) {
			for(int j =0; j <suits.length;j++) {
				unDealt.add(new Card(ranks[i], suits[j], value[i]));
			}
		}
	}
	
	public boolean isEmpty() {
		if(unDealt.size() == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return unDealt.size();
	}
	
	public Card deal() {
		 
		if(unDealt.size() == 0) 
		{
			return null;
		}
		else {
			
		}
		
		
	
	}

	public void shuffle() {
	
		for(int k=51; k > 0;  k--) {
			for(int j=0; j < unDealt.size()-1;  j++) {
			int randomInteger = (int)(Math.random() * k + 1);
			k = randomInteger;
			Card temp = unDealt.get(k);
			Card temp1 = unDealt.get(j);
			if(k >j) {
			unDealt.set(k, temp1);
			unDealt.set(j, temp);
			}	
			}
		}
		
	}
}
	
	   
	
