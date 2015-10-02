/**
 * This is the DataSet class for single numbers
 * 
 * @author Nelson Alemar
 *
 */

public class DataSet {
	
	private double s1, s2; 
    private int n; 
    
    /**
     * This is the DataSet constructor. This object is used to calculate statistics of numbers.
     */
    
    public DataSet() { 
         s1 = s2 = 0; 
         n = 0; 
    } 
    
    /**
     * Method to modify current DataSet object.
     * 
     * @param x adds more values to the current statistics
     */
    
    public void add(double x) { 
        n++; 
        s1 += x*x;
        s2 += x;  
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
