package com.bridgelabz.snakeandladder;

import java.util.Dictionary;

/**
 * 
 * @author pande
 *
 */
public class Player {

	public void toRollADice() {
		/*here,the player rolls the dice to get the number
		 *hence,players position gets updated with newly generated random number
		 *
		 *generate the random number to check for the option
		 *	if its 0 then :no play
		 *	if its 1 then : its ladder
		 *	if its 2 then :its snake
		 * 
		 */
		int playerPosition =0;//uc1 added
		System.out.println("Initial position of the player is :"+  playerPosition);
		System.out.println("====After,rolling the dice===========================");
		int diceRolling = (int )(Math.random() *6 )+1; 
		System.out.println("Rolled dice number is : "  +  diceRolling);
		
		
		System.out.println("=====================choices===============");
		int optionCheck = (int)(Math.random()*3);
		switch(optionCheck) {
			case 0:System.out.println("So its No Play");
			System.out.println("Players position would be :"+playerPosition);
			break;
			
			case 1:System.out.println("its a Ladder");
			playerPosition = playerPosition+diceRolling;
			System.out.println("Players position would be :" + playerPosition);
			break;
			
			case 2:System.out.println("its a Snake");
			playerPosition = playerPosition - diceRolling;
			if(playerPosition<0) {
				playerPosition = 0;
			}
			System.out.println("players position is :" + playerPosition);
			break;
				
		}
		
	}

}
