/**
 * This is the DataSet for pair of numbers
 * 
 * @author Nelson Alemar
 *
 */

public class DataSetPairs {

	private double s1, s2; 
    private int n; 
    
    /**
     * This is the DataSet constructor. This object is used to calculate statistics of numbers.
     */
    
    public DataSetPairs() { 
         s1 = s2 = 0; 
         n = 0; 
    } 
    
    /**
     * Method to modify current DataSetPairs constructor. These parameters will multiply each other
     * and then be added to a list of numbers.
     * 
     * @param x adds more values to the current statistics
     * @param y adds more values to the current statistics
     */
    
    public void add(double x, double y) { 
    	double z = x*y;
        n++; 
        s1 += z*z;
        s2 += z;  
    } 
    
    /**
     *  Getter method for the DataSet class
     *  
     * @return average of numbers of current list of numbers
     */
    
    public double getAverage() { 
        if (n==0) return 0.0; 
        return s2 / n; 
    } 
    
    /**
     *  Getter method for the DataSet class
     *  
     * @return standard deviation of current list of numbers
     */
    
    public double getSD() { 
        if (n<=1) return 0.0; 
        return Math.sqrt((s1-s2*s2/n)/(n-1)); 
    } 
}
