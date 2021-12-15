package com.bridgelabz.gambler;

public class GamblerGame {
	static int Stake=100;
	static int Bet=1;
	static int WON=1;
	static int LOST=0;
	public static void main(String[] args) {
		int play = (int) Math.floor(Math.random() * 10) % 2;
		 System.out.println("Gamblers play:"+play);
		 int cashInHand = Stake;
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
		 if(cashInHand==150 || cashInHand==50) {
			 System.out.println("Player would like to resign for current day");
			 
		 }
	}
	
	
}
