/*************************************************************
 * 
 * 						LivingThing class
 * 
 ************************************************************/


//This seems pretty specific, but this will be a superclass for all living thing classes. This will be a superclass
//for the player, other character npcs, and even the generic npcs. Every living thing will have properties like an image 
//Or name. Even an animal might be a living thing

package slick.Bard.AsAlways;

import org.newdawn.slick.Image;

public class LivingThing {

	
	//After looking this up, I found some useful information about inheritance when deciding whether it's best to make
	//These superclass fields public or private. a subclass DOES NOT inherit any members of the superclass that are private.
	//However, an instance of the subclass DOES inherit private members of the superclass. In this case, I've decided to use
	//private variables so all the instances of the subclass will have access to these variables.  
	//SRC: http://stackoverflow.com/questions/4716040/does-subclasses-inherit-private-fields
	
	//In every case, all living things will inherit an image to be displayed on the screen.
	private Image[] image = null;
	//In every case, all living things will inherit a name of some sort (even the player)
	private String name = null;
	
	/*********************************************
	*			LivingThing Constructor 
	 *********************************************/
	public LivingThing(Image front, Image back, Image left, Image right)
	{
		//The constructor will take the front, back, left, and right images as a parameter and assign them to image
		image = new Image[]{front, back, left, right};
	}
	
	//Here are the getter and setter methods for each of the variables in livingthings 
	public Image[] getImage(){
		return image;
	}
	public void setImage(Image[] image){
		this.image = image;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
}
