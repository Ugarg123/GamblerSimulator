package com.bridgelabz.gambler;

public class GamblerGame {
	static int Stake=100;
	static int Bet=1;
	static int WON=1;
	static int LOST=0;
	static int Total_Amount=0;
	static int Total_Amount_In_Month=0;
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
				 		 break;
				 }
				 
			 }
			 if(cashInHand==150 || cashInHand==50) {
				 System.out.println("Player would like to resign for current day");
			 }
			 if(cashInHand > 100) {
				 int amountWonPerDay = cashInHand - Stake;
				 System.out.println("Player won day"+i+" RS "+amountWonPerDay);
			 }
			 else if(cashInHand < 100){
				 int amountLostPerDay = Stake - cashInHand;
				 System.out.println("Player lost day"+i+" RS "+amountLostPerDay);
			 }
			 Total_Amount = Total_Amount + cashInHand;
		 }
		 System.out.println("Total amount player has after 20 days as per day included = "+Total_Amount+" $");
		 Total_Amount_In_Month = Total_Amount - Stake * 20;
		 if(Total_Amount_In_Month > 0) {
			 System.out.println("Total cash gambler won "+Total_Amount_In_Month+" $");
		 }
		 else {
			 System.out.println("Total cash gambler lost in that month "+Total_Amount_In_Month+" $");
		 }
			 
	}
	
	
}
