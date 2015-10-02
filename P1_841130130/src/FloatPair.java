/** This is a class for a pair of numbers of the "float" type.
 * 
 * @author Nelson Alemar
 */

public class FloatPair {
	
	private float first, second; // first and second values of the pair
	
	/** The FloatPair constructor with no parameters nor return value.
	 * This is to allow the object to be created without the need to initialize
	 * a variable
	 */
	
	public FloatPair(){
	}
	
	/** The FloatPair constructor.
	 * 
	 * @param first is the first value of the pair.
	 * @param second is the second value of the pair.
	 */
	
	public FloatPair(float first, float second){
		this.first = first;
		this.second = second;
	}
	
	/** Getter of the FloatPair object.
	 * 
	 * @return first value of the pair.
	 */

	public float getFirst() {
		return first;
	}
	
	/** Setter for the FloatPair object. 
	 * 
	 * @param first changes the value of the first value to this new one.
	 */

	public void setFirst(float first) {
		this.first = first;
	}
	
	/** Getter of the FloatPair object.
	 * 
	 * @return second value of the pair.
	 */
	
	public float getSecond() {
		return second;
	}
	
	/** Setter for the FloatPair object. 
	 * 
	 * @param second changes the value of the second value to this new one.
	 */
	
	public void setSecond(float second) {
		this.second = second;
	}
	
	/**
	 * String method for the FloatPair class
	 * 
	 * @return The object as a string
	 */
	
	public String toString(){
		return "("+first+","+second+")";
	}

}
