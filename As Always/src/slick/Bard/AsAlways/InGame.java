/********************************************************
 * 					  In Game State	
 ********************************************************/

//The inGame class will be the main game loop class in As Always. This class will contain the majority of the game, except
//For any menu screens or other places outside of the school

//The slick.Bard.AsAlways package will contain all of the classes in our game
package slick.Bard.AsAlways;

//Here are all our imports that will be needed for the main class
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

//This class will extend BasicGameState because it is one of the states in our game. In this particular case,
//It is the biggest and most important game state in the game. It's the main gamestate.
public class InGame extends BasicGameState{
	
	//Here we'll keep track of the ID of the in game state
	//when this state is added in Main, it'll pass in
	//an argument that changes this to a more specified
	//ID.
	int stateID = 0;

	
	/************************************************
	 *				In Game Constructor 
	 ***********************************************/
	public InGame(int stateID){
		
		//When the InGame state is added in Main, it will pass in a stateID which changes the stateID in this class
		//to a more specific variable
		this.stateID = stateID;
	}
	
	//We need to make a simple getID method to return the stateID. This is actually a required method for a gamestate class.
	public int getID() {
	    return stateID;
	}
	
	/***********************************************
	 * 				In Game Initialization
	 ***********************************************/
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		
	}

	
	/************************************************
	 * 				In Game Update
	 ************************************************/
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		
		
	}

	
	/*************************************************
	 * 				In Game Render
	 *************************************************/
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {

		
	}
	
}
