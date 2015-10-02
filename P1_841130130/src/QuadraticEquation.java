/** A class that acts out the properties of a quadratic equation
 * 
 * @author Nelson Alemar
 *
 */

public class QuadraticEquation {
	
	private float a;  //coefficient of degree 2 term
    private float b;  //coefficient of degree 1 term
    private float c;  //coefficient of degree 0 term (constant term)
    
    /** Quadratic equation object of the form ax^2 + bx + c.
     * 
     * @param a is the coefficient of the second degree variable 
     * @param b is the coefficient of the first degree variable 
     * @param c is the constant's coefficient
     */
    public QuadraticEquation(float a, float b, float c) { 
          this.a = a; 
          this.b = b; 
          this.c = c; 
    }
    
    /** Counts number of different real solutions the equation
    has. 
    @return An integer value in range 0-2 (0, 1, or 2)
            corresponding to the number of different real 
            solutions that the equation has. 
     */
    
    public int realSolutionsCount() {
    
    	float discriminant = (float)(Math.pow(b,2)-4*a*c); // this variable 
    													// decides how many solutions
    	
    	if (discriminant < 0){
    		
    		return 0;
    	}
    	
    	else if (discriminant > 0){
    		
    		return 2;
    	}
    	
    	else {
    		
    		return 1;
    	}
    }
    
    /** Returns the real solutions of the equation, if any. 
    @return Reference to a new object (a pair of Float 
            objects) if the equation has at least one real
            solution. If no real solution, it then returns
            null value. In the case of only one real solution, 
            both components of that pair reference the same
            Float object whose value is that real solutions. 
            If it has two real solutions, the components
            of that pair object are references to both, 
            respectively.
     */
    
	public FloatPair getRealSolutions(){ 
    	
    	float x1, x2;
    	float discriminant = (float)(Math.pow(b,2)-4*a*c);
    	FloatPair solutionSet = new FloatPair();
    	
    	if (realSolutionsCount()>0){
    		
    		x1 = (float) ((-b+Math.sqrt(discriminant))/(2*a));
    		x2 = (float) ((-b-Math.sqrt(discriminant))/(2*a));
    		
    		solutionSet.setFirst(x1);
    		solutionSet.setSecond(x2);
    		
    		System.out.print("The solution set for this equation is: ");
    		System.out.println(solutionSet);
    		
    	}
    	
    	else {
    		solutionSet = null;
    		System.out.println("The equation has no real solutions.");
    	}
    	
    	return solutionSet;
    } 
	
	public String toString(){
		
		return a+"x^2"+"+"+b+"x"+"+"+c+" = 0";
	}

}
