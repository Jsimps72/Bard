/*****************************************************
 * 
 * 						Player
 * 
 *****************************************************/

//This class holds all of the information for the player. It will contain all methods for movement, collision, and any
//Stats or variables the player might possibly have. The player will extend the living thing superclass so it can
//inherit all of those variables and methods (if it has any methods)
package slick.Bard.AsAlways;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player extends LivingThing{

	/*************************************************
	 * 				Variable Initialization
	 *************************************************/
	//These final variables will hold the coordinates for the player. This will never change
	//because the player always stays in the middle of the screen
	private final int PX = 400;
	private final int PY = 300;
	
	
	/**************************************************
	 * 
	 * 				 Player Constructor
	 * @throws SlickException 
	 * 
	 **************************************************/
	public Player() throws SlickException{

		//Here we will initialize the image array of the player by adding his front, back, and side profiles
		super(new Image("res/livingthing/front/MaleMainCharacter.png"), new Image("res/livingthing/front/MaleMainCharacter.png"),
				new Image("res/livingthing/front/MaleMainCharacter.png"), new Image("res/livingthing/front/MaleMainCharacter.png"));
		
		
	}
	
	
	
	
}
