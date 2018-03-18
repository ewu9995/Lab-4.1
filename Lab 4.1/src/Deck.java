import java.util.ArrayList;


/*
* Evan Wu
* Lab 4.1
* AP CSA Period 2
*/

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
		else 
		{
			unDealt.remove(0);
			Dealt.add(unDealt.get(0));
			return(unDealt.remove(0));
		}
	
	}

	public void shuffle() {
	
		for(int k=51; k > 0;  k--) {
			int r = (int)(Math.random() * k + 1);
			Card temp = unDealt.get(k);
			Card temp1 = unDealt.get(r);
			unDealt.set(k, temp1);
			unDealt.set(r, temp);
			}			
	}
}
	
	   
	
