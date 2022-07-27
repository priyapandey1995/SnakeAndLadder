package com.bridgelabz.snakeandladder;

import java.util.Dictionary;

/**
 * 
 * @author pande
 *
 */
public class Player {
	
	static final int winningPosition = 100;

	public void toRollADice() {
		/**here,the player rolls the dice to get the number
		 *hence,players position gets updated with newly generated random number
		 *
		 *generate the random number to check for the option
		 *	if its 0 then :no play
		 *	if its 1 then : its ladder
		 *	if its 2 then :its snake
		 *
		 * checks for the exact winning position
		 * count variable is initialized to check the number of times the dice is played
		 * 
		 */
		
		int playerPosition =0;
		int count = 0;
		
		System.out.println("Initial position of the player is :"+  playerPosition);
		
		while(playerPosition!=winningPosition) {
		
			 count++;
			
		int diceRolling = (int)(Math.floor((Math.random()*6)+1));
		
		int optionCheck = (int)(Math.floor(Math.random()*3));
		switch(optionCheck) {
			case 0:System.out.println("So its No Play");
			System.out.println("Players position would be :"+playerPosition);
			break;
			
			case 1:System.out.println("its a Ladder");
			playerPosition= playerPosition+diceRolling;
			if(playerPosition>winningPosition) {
			playerPosition = playerPosition-diceRolling;
			System.out.println("Players position would be :" + playerPosition);
			}
		    break;
			
			case 2:System.out.println("its a Snake");
			playerPosition = playerPosition - diceRolling;
			if(playerPosition< 0) {
				playerPosition = 0;
				break;
			}
		}
			
			System.out.println("player position is "+playerPosition);
			if(playerPosition == winningPosition)
			{
				System.out.println("it has reached to the winning position");
				System.out.println("the total no of time the dice was played to win the game"+ " "+count);
			}
			
				
		
		
		
		
	}

		
		
	}

}
