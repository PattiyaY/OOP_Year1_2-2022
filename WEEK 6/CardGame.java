package Assignment;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CardGame {
	 private String[] rank = {"1", "2", "3", "4", "5", "6",
	           "7", "8", "9", "10", "11", "12", "13"};
	 //Ace = 1 Jack = 11, Queen = 12, King = 13
	 private String[] suit = {"Clubs","Diamionds", "Hearts", "Spades"};
	 public static int[] deck = {1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 13, 
			 						14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 
			 						27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 
			 						40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};
	 
//	 public static int[][] deckCheck = {{0, 1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 13}, 
//				{14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26}, 
//				{27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39}, 
//				{40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52}};

	 public static String[][] deckCheck = {{"1", "2", "3", "4",  "5",  "6",  "7",  "8",  "9",  "10", "11", "12", "13"}, 
										{"14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"}, 
										{"27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39"}, 
										{"40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52"}};

	 private int[] player1 = new int[2];  
	 private int[] player2 = new int[2];
	 private String[] check1 = new String[2];
	 private String[] check2 = new String[2];
	 
	 public static void shuffle(int[] deck, int cards) {
		 Random random = new Random();
		 for (int i = 0; i < deck.length; i++) {
			 int k = i + random.nextInt(deck.length-i);
			 int temp = deck[k];
             deck[k] = deck[i];
             deck[i] = temp;
             //Check if it is shuffle correctly
			 System.out.print(deck[i] + " ");
		 }
		 System.out.println();
	 }
	 
	 public void givePiles() {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("-----------Player 1-----------");
		 for (int i = 0; i < 2; i++) {
			 System.out.print("Enter number between 1 to 51 : ");
			 int numCard = scan.nextInt();
			 this.player1[i] = deck[numCard];
 		 }
		 
		 System.out.println("-----------Player 2-----------");
		 for (int i = 0; i < 2; i++) {
			 System.out.print("Enter number between 1 to 51 : ");
			 int numCard = scan.nextInt();
			 this.player2[i] = deck[numCard];
 		 }
		 scan.close();
		 System.out.println();
		 //Check if each of player get piles
		 //System.out.println(Arrays.toString(player1));
		 //System.out.println(Arrays.toString(player2));
	 }
	 
	 public void findValue(int i) {
		
			 if (true) { 
				 for (int j = 0; j < deckCheck.length; j++) {
					 for (int k = 0; k < deckCheck[j].length; k++) {
						 if (Integer.toString(player1[i]).equals(deckCheck[j][k])) {
							 this.check1[0] = this.suit[j];
							 this.check1[1] = this.rank[k];
						 }
					 }
				 }
				 
				 for (int j = 0; j < deckCheck.length; j++) {
					 for (int k = 0; k < deckCheck[j].length; k++) {
						 if (Integer.toString(player2[i]).equals(deckCheck[j][k])) {
							 this.check2[0] = this.suit[j];
							 this.check2[1] = this.rank[k];
						 }
					 }
				 }
			 } 
			 
		 System.out.print("PLayer 1 " + Arrays.toString(check1) + " ");
		 System.out.println("Player 2 " + Arrays.toString(check2));
	 }
	 public void getWinner() { 
		 int clubs = 0;
		 int diamonds = 1;
		 int hearts = 2;
		 int spades = 3;
		 int keep1 = 0;
		 int keep2 = 0;
		 if (Integer.parseInt(check1[1]) > Integer.parseInt(check2[1]) ){
			 System.out.println("Player 1 is the winner");
		 } else if (Integer.parseInt(check1[1]) < Integer.parseInt(check2[1])){
			 System.out.println("Player 2 is the winner");
		 } else if (Integer.parseInt(check1[1]) == Integer.parseInt(check2[1])) {
				if (check1[0] == "Clubs") {
					keep1 += clubs;
				} else if(check1[0] == "Diamonds") {
					keep1 += diamonds;
				} else if(check1[0] == "Hearts") {
					keep1 += hearts;
				} else if(check1[0] == "Spades") {
					keep1 += spades;
				} else {
					keep1 = 0;
				}
				
				if (check2[0] == "Clubs") {
					keep2 += clubs;
				} else if(check2[0] == "Diamonds") {
					keep2 += diamonds;
				} else if(check1[0] == "Hearts") {
					keep2 += hearts;
				} else if(check1[0] == "Spades") {
					keep2 += spades;
				} else {
					keep2 = 0;
				}
			}

		 
		 if(keep1 > keep2) {
			 System.out.println("Player 1 is the winner");
		 } else if(keep1 < keep2) {
			 System.out.println("Player 2 is the winner");
		 } 
		 System.out.println();
	 }
}

