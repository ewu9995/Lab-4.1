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
	boolean dealt = false;
	Card returnNull = null;
	
		if(!dealt) 
		{
			for(int i=0; i < unDealt.size(); i++)
			{
				dealt =true;
				unDealt.remove(i);

			}
		}
		
		if(unDealt.size() == 0) 
		{
		returnNull= null;
		}
	
		return returnNull;
	}
	
	public void shuffle() {
		for(int k=51; k < unDealt.size();  k--) {
			unDealt.add();
		}
	}
	
	 
	
	
	
	
}
