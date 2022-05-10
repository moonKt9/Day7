package com.bridgelabzhw2;
import java.util.Random;
public class GamblerSimulator11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("Welcome Gambler");
		
		int Every_Day_Stack=100;
		int Bet_Every_Game=1;
		System.out.println("Every Day Stack:"+Every_Day_Stack);
		System.out.println("Bet Price:"+Bet_Every_Game);
		
		Random random=new Random();
		int Bet=random.nextInt(2);
		if(Bet==1) {
			 System.out.println("Bet Win");
			 System.out.println("Final Amount:"+(Every_Day_Stack+=Bet_Every_Game));
		}
		else {
			 System.out.println("Bet Loss");
			 System.out.println("Final Amount:"+(Every_Day_Stack+=Bet_Every_Game));
		}
	}

}
