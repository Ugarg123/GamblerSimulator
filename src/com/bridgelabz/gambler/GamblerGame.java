package com.bridgelabz.gambler;

public class GamblerGame {
	static int Stake=100;
	static int Bet=1;
	static int WON=1;
	static int LOST=0;
	static int Total_Amount=0;
	public static void main(String[] args) {
		int play = (int) Math.floor(Math.random() * 10) % 2;
		 System.out.println("Gamblers play:"+play);
		 for (int i =1; i <=20; i++) {
			 int cashInHand = Stake;
			 while(cashInHand > 50 && cashInHand <150) {
				 int start = (int) Math.floor(Math.random() * 10 % 2);
				 System.out.println("Gamblers play:"+play);
				 
				 switch(play) {
				 	case 1:
				 		 cashInHand = cashInHand + Bet;
				 		 System.out.println("Total current cash gambler has "+cashInHand);
				 		 break;
				 	case 2:
				 		 cashInHand = cashInHand - Bet;
				 		 System.out.println("Total current cash gambler has "+cashInHand);
				 		 break;
				 	default:
				 		 System.out.println("default");
				 }
				 if(play == 1) {
					 System.out.println("Player won the first play");
				 }
				 else {
					 System.out.println("Player lost the first play");
				 }
			 }
			 if(cashInHand==150 || cashInHand==50) {
				 System.out.println("Player would like to resign for current day");
			 }
			 Total_Amount = Total_Amount + cashInHand;
		 }
		 System.out.println("Total amount player has after 20 days as per day included = "+Total_Amount+" $");
		 
			 
	}
	
	
}
