package war_assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name, int score) {
		
		this.name = name;
		this.score = score;
		
		hand = new ArrayList<>();
		
	}

	public String describe() {
		return "Name: " + name + "Score: " + score;
	}
	
	public Card flip() {
		if(!hand.isEmpty()) {
			return hand.remove(0);
		} else {
			return null;
		}
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void draw(Deck deck) {
		Card card = deck.draw();
		if (card != null) {
			hand.add(card);
		} else {
			System.out.println("No cards left in the deck!");
		}
	}
	
	public int incrementScore() {
		return this.score += 1;
	}
	
}
