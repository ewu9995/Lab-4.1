
public class Deck {
 
	public Deck(String[] ranks, String[] suits, int[] value) {
		for(int i=0; i<ranks.length; i++) {
			for(int j =0; j <suits.length;j++ ) {
				unDealt.add(new Card(ranks[i], suits[j], value[i]));
			}
		}
	}
}
