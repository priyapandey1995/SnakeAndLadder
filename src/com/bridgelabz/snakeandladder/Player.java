package com.bridgelabz.snakeandladder;
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
		 */
		int playerPosition =0;//uc1 added
		System.out.println("The initial position of the player is"+" " +playerPosition);
		System.out.println("====Now,the player rolls the dice====");
		/**
		 * uc2 added
		 */
		int diceRolling = (int )(Math.random() *6 )+1; 
		System.out.println(diceRolling);
		playerPosition = playerPosition+diceRolling;
		System.out.println("After the rolling the dice,the players position is"+ " "+playerPosition);
		
		
	}

}
