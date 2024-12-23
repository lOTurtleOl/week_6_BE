package war_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;

	public Deck() {
		
		cards = new ArrayList<>();
		String[] names = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		for (String name : names) {
			for (int value : values) {
				cards.add(new Card(value, name));
			}
		}
		
	}
	
	// Shuffle
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Deal
	public Card draw() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		} else {
			return null;
		}
	}

}
