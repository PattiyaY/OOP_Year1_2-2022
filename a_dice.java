package Exercise;

public class a_dice {

	public static int rollDice() {
		return (int)(Math.random()*6)+1; //Random between number 1 to 6
	}
	
	public static void main(String[] args) {
		System.out.println(rollDice());

	}

}
