package war_assignment;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Andrew", 0);
		Player player2 = new Player("Michaela", 0);
		
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			System.out.print("Player 1 card is: ");
			card1.describe();
			Card card2 = player2.flip();
			System.out.print("Player 2 card is: ");
			card2.describe();
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 received a point");
			} else if (card2.getValue() > card1.getValue()){
				player2.incrementScore();
				System.out.println("Player 2 received a point");
			} else {
				System.out.println("It's a tie, no points awarded");
			}
			System.out.println("Player 1 score is: " + player1.getScore());
			System.out.println("Player 2 score is: " + player2.getScore() + "\n");
		}
		
		System.out.println("Player 1 final score: " + player1.getScore() + "\nPlayer 2 final score: " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println("\tWinner: Player 1");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("\tWinner: Player 2");
		} else {
			System.out.println("\tDraw");
		}
	}

}
