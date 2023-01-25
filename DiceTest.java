package Assignment;

public class DiceTest {

	public static void main(String[] args) {
		DiceGame myDice = new DiceGame();
		DiceGame player1 = new DiceGame();
		DiceGame player2 = new DiceGame();
		int i = 1;
		
		System.out.println("---------- Welcome To Toss Dice Game! ----------" + "\n");
		while (i <= 5) {
			System.out.println("Toss Dice round " + i);
			player1.TossDice();
			System.out.print("Player one tossed dice ");
			player1.printPips();
			player1.sumPlayer1();
			
			player2.TossDice();
			System.out.print("Player two tossed dice ");
			player2.printPips();
			player2.sumPlayer2();
			System.out.println();
			
			myDice.isWon();
			i++;
		}
		myDice.isWinner();
	}

}