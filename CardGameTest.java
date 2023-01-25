package Assignment;

public class CardGameTest {

	public static void main(String[] args) {
		CardGame dealer = new CardGame();
		
		CardGame.shuffle(CardGame.deck,52); 
		dealer.givePiles();
		for(int i = 0; i < 2; i++){
			dealer.findValue(i);
			dealer.getWinner();
		}
		
	}
}
