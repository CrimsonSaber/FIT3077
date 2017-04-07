//lol testing
/** 
 * An Assesement class for inheritance by Exam and assignment classes
 * @author Saurav Kadam
 */

public abstract class Assesement {
	/**
	 * weight is a variable of type int that holds the marks for a type of assesement
	 */
	int weight;
	
	/**
	 * setValue() takes an input weight from outside the class,and sets the assesement weight to the 
	 * input.
	 * @param weight - the input mark for that unit's assesement
	 */
	public void setValue(int weight){
		this.weight = weight;
	}
	
	/**
	 * @return weight returns the weight of an assesement
	 */
	public int getValue(){
		return weight;
	}
	/**
	 * description() is an abstract method, used by the children classes of Assesement
	 * @return returns nothing, inherited classes using this method do.
	 */
	public abstract String description();
}
