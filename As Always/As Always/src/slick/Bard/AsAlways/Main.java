/***************************************************************************************************
 * 				  								As													*
 * 			    							  Always												*
 * 				  																					*
 * 			 								BardSoftware											*
 ***************************************************************************************************/

//Welcome to As Always! The design doc for this game is online, and several design conversations have been recorded
//To help with the development process. In the code, green code is going to specify comments about the logic, syntax, 
//and code that needs to be revisited/recoded. Blue code will specify a new portion of the code, it will help distinguish
//When there is a new main portion of the code.

//The slick.Bard.AsAlways package will contain all of the classes in our game
package slick.Bard.AsAlways;

//Here are all our imports that will be needed for the main class
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

//The main class will set up the application and its properties, as well as define and add all our game states.
//We extend StateBasedGame because this is the main class of a 
public class Main extends StateBasedGame{
	 
	/******************************************
	 * 	Variable Declaration/Initialization
	 ******************************************/
	
	//All private variables will be able to be received in a getter method. This way they can be accessed from other classes
	//Here will be the ID for the state INGAMESTATE, which will be the main gameplay state of the game
	private static final int INGAMESTATE = 1;	
	//These two variables will control the screen width and height and will be static for access by all classes
	private static final int SCREENWIDTH = 800;
	private static final int SCREENHEIGHT = 600;
	
	/*****************************************
	 * 		   Getter/Setter Methods
	 *****************************************/
	
	//Here is the getter method for ScreenWidth
	public static int getScreenWidth() {
		return SCREENWIDTH;
	}
	//Getter method that returns screenheight
	public static int getScreenHeight() {
		return SCREENHEIGHT;
	}
	//Returns ID for INGAMESTATE gamestate
	public static int getInGameState() {
		return INGAMESTATE;
	}
	
	/*****************************************
	 * 			Main Constructor
	 *****************************************/
	  public Main()
	  {
		 //The StateBasedGame constructor titles the top of the window.
		 //We can control this with super
	     super("As Always");
	  }
	  
	 /****************************************
	  * 			Main Method
	  ****************************************/
	  public static void main(String[] args) throws SlickException
	  {
		 //Creates our new window. We pass in Main
	     AppGameContainer app = new AppGameContainer(new Main());
	     //Caps the fps at 60
	     app.setTargetFrameRate(60);
	     //our window will be an SCREENWIDTH,SCREENHEIGHT
	     app.setDisplayMode(SCREENWIDTH, SCREENHEIGHT, false);
	     //This is true for debugging purposes. Will change for later builds-----------------------------------------------------
	     app.setShowFPS(true);
	     //let's start
	     app.start();
	  }
	  
	  /****************************************
	   * 		Adding GameState Method
	   ****************************************/
	  public void initStatesList(GameContainer gameContainer) throws SlickException {
	      //less add InGameState to all our states.
		  this.addState(new InGame(INGAMESTATE));
	  }
	  
	  
}
