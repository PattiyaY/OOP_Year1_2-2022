package Assignment;

import java.util.Arrays;

public class DiceGame {
	private int faceUp_1;
	private int faceUp_2;
	private int sum;
	static int sumPlayerOne;
	static int sumPlayerTwo;
	static int oneWin = 0;
	static int twoWin = 0;
	
	public void TossDice() {
		faceUp_1 = (int)(Math.random()*6)+1;
		faceUp_2 = (int)(Math.random()*6)+1;
	}
	
	public void printPips(){
		int[] faceUp = new int[2];
		faceUp[0] = faceUp_1;
		faceUp[1] = faceUp_2;
		sum = Arrays.stream(faceUp).sum();
		System.out.println(Arrays.toString(faceUp));
	}
	
	public void sumPlayer1() {
		sumPlayerOne = 0;
		sumPlayerOne += sum;
	}
	
	public void sumPlayer2() {
		sumPlayerTwo = 0;
		sumPlayerTwo += sum;
	}
	
	public void isWon() {
		if (sumPlayerOne > sumPlayerTwo) {
			System.out.println("--------Player one won--------");
			oneWin += 1;
		} else if (sumPlayerTwo > sumPlayerOne){
			System.out.println("--------Player two won--------");
			twoWin += 1;
		} else { 
			System.out.println("----------No one won-------- ");
		} 
		System.out.println();
		System.out.println();
	}
	
	public void isWinner() {
		if(oneWin > twoWin) {
			System.out.println("--------The first player is the winner--------");
		} else if (twoWin > oneWin) {
			System.out.println("--------The second player is the winner--------");
		} else {
			System.out.println("neither first player nor second player is the winner");
		}
	}
	
}
