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
		
		/**two player are initialized ,
		 * here,both the player rolls the dice to reach till 100 position
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
		 * 
		 */
		
		int playerOnePosition =0;
		int playerTwoPosition=0;
		int diceRollingOne,diceRollingTwo;
		int count_player_1 = 0;
		int count_player_2=0;
		
		System.out.println("Initial position of the player is :"+  playerOnePosition + "and"+playerTwoPosition);
		
		while(playerOnePosition!=winningPosition && playerTwoPosition!=winningPosition) {
	    count_player_1++;
		diceRollingOne = (int)(Math.floor((Math.random()*6)+1));
		
		int optionCheck = (int)(Math.floor(Math.random()*3));
		switch(optionCheck) {
			case 0:System.out.println("So its No Play");
			System.out.println("Players position would be :"+playerOnePosition);
			break;
			
			case 1:System.out.println("its a Ladder");
			playerOnePosition= playerOnePosition+diceRollingOne;
			if(playerOnePosition>winningPosition) {
			playerOnePosition = playerOnePosition-diceRollingOne;
			System.out.println("Players position would be :" + playerOnePosition);
			}
		    break;
			
			case 2:System.out.println("its a Snake");
			playerOnePosition = playerOnePosition - diceRollingOne;
			if(playerOnePosition< 0) {
				playerOnePosition = 0;
				break;
			}
		}
			
			System.out.println("playerOne position is "+playerOnePosition);
		
			/*
			 * Second player starts to play
			 */
			count_player_2++;
			System.out.println("the count for palyer 2 is"+ count_player_2);
			diceRollingTwo = (int)(Math.floor((Math.random()*6)+1));
			int optionCheckTwo= (int)(Math.floor(Math.random()*3));
			
			switch(optionCheckTwo) {
			case 0:System.out.println("So its No Play");
			System.out.println("Players position would be :"+playerTwoPosition);
			break;
			
			case 1:System.out.println("its a Ladder");
			playerTwoPosition= playerTwoPosition+diceRollingTwo;
			if(playerTwoPosition>winningPosition) {
			playerTwoPosition = playerTwoPosition-diceRollingTwo;
			System.out.println("Player Two position would be :" + playerTwoPosition);
			}
		    break;
			
			case 2:System.out.println("its a Snake");
			playerTwoPosition = playerTwoPosition - diceRollingTwo;
			if(playerTwoPosition< 0) {
				playerTwoPosition = 0;
				break;
			}
		}
			System.out.println("player two position is"+playerTwoPosition);
			
	}
		if(playerOnePosition ==winningPosition) {
			System.out.println("Player one has won the game"+ "with" + " " +count_player_1 + " steps");
		}
		else {
			System.out.println("Player two has won the game" + "with" +" "+ count_player_2 + "steps");
		}

		
		
	}

}
