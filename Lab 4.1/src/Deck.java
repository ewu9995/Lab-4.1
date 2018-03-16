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
		int number =0;
		for(int i= unDealt.size()-1; i >0; i--)
		{
			unDealt.remove(i);                                                                                                                                                                                             
			
			if(unDealt.size() !=0) {
			return Dealt
		}
		}
		
		if(unDealt.size() == 0) 
		{
			return null;
		}

		
	}

	public void shuffle() {
	
		for(int k=51; k < unDealt.size()-1;  k++) {
			int randomInteger = (int)(Math.random() * k + 1);
			k = randomInteger;
			for(int r=0; r < unDealt.size()-1;  r++) {
				Card temp = unDealt.get(k);
				k = unDealt.set(r);
				
			}
		}
		
	}
	
	   
	
	
	
	
}
