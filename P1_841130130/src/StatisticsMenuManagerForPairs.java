import java.util.Scanner;

/** This is the StatisticsMenuManagerForPairs class. 
 * This class includes the options that will manage or modify a list of pairs of numbers
 * @author Nelson Alemar
 * 
 */

public class StatisticsMenuManagerForPairs {
	
	private static Scanner input = new Scanner(System.in); // This will be the only scanner object used throughout the class
	private static DataSetPairs list = new DataSetPairs(); // This will be the DataSet used for the class, it's static so it's value will never reset and always remains
 
	/**
	 * This is the principal operation of the second option of the Numbers Menu Manager.
	 * You enter a list of numbers and when you enter "END", it redirects you to the 
	 * statisticsMenuManager method.
	 */
	
    public static void statistics(){
    	
    	
		String first, second;
		boolean exit = true;
    		
		System.out.println("\nEnter pairs of numbers one by one to add to a list. If done, enter 'END': ");
		
		System.out.print("Enter first number: ");
		first = input.next();
		
		/*
		 * This evaluates FIRST the first input, if it's the word "END", then it goes to the 
		 * compute statistics menu. If it's not, it goes to evaluate the second input. Which 
		 * does the same evaluation.
		 */
		
		if(first.equalsIgnoreCase("END")){
			
			exit = false;}
		else {		
			
			System.out.print("Second number: ");
			second = input.next();
			
			if(second.equalsIgnoreCase("END")){
				
				exit = false;
			}
			
			/* if either the first input OR the second input is the word "END",
			 * it stops adding pairs. If you add a number and the second input is the 
			 * word "END", it stops adding pairs and discards the last number entered.
			 */
			else {
				while (exit == true){
					
					double c = Double.parseDouble(first);
					double d = Double.parseDouble(second);
					
					list.add(c,d);
					
					System.out.print("\nFirst: ");
					first = input.next();
					
					if (first.equalsIgnoreCase("END")){
						exit = false;
					}
					
					else {	
						
						System.out.print("Second: ");
						second = input.next();
						
						if (second.equalsIgnoreCase("END")){
							
							exit = false;}
						else {
							exit = true;}
					}
			}
			}
		}
		
		StatisticsMenuManagerForPairs.statisticsMenuManager();
    }
    
    /**
     *  This method displays Statistics sub menu, which will let you modify the current list of numbers or calculate average
     *  or standard deviation of the current list. This method also leads you back to the Numbers Menu when you "exit" it using
     *  the available options.
     */
    
    public static void statisticsMenuManager(){
    
		System.out.print("\n\t Statistics Menu: "
                    +"\n\t1)Show average of numbers on current list: "
                    +"\n\t2)Show standard deviation of numbers in current list: "
                    +"\n\t3)Add more values to the current list: "
                    +"\n\t4)Exit"+"\n "
                    +"\n\n\tEnter your selection: ");
		
		int choice = input.nextInt();
		
		boolean exitMenu;
		
	
			
        if (choice==0)
        {
            /*
            here the user is notified that he has failed to enter a valid
            selection within the 3 attempts and the program terminates.
            */
            exitMenu = true;
        }
    else if (choice==1)
        {
            /*
            Code to initiate actions associated to option 1.
            */
           System.out.println("\nThe average of the numbers of the current list is: "+list.getAverage());
           
           StatisticsMenuManagerForPairs.statisticsMenuManager();

        }
    else if (choice==2)
        {
            /*
            Code to initiate actions associated to option 2.
            */
    		System.out.println("\nThe standard deviation of the current list is: "+list.getSD());
    		StatisticsMenuManagerForPairs.statisticsMenuManager();
        }
    else if (choice==3)
        {
            /*
            Code to initiate actions associated to option 3.
            */
    	
    	boolean newExit = true;
    	
    	System.out.println("Please enter more numbers to add to the list. Enter 'END' when done: ");
    	System.out.print("Enter first number: ");
    	String newFirst = input.next();
    	
    	if (newFirst.equalsIgnoreCase("END")){
    		
    		newExit = false;}
    	
    	else{
    		
    		System.out.print("Second number: ");   		
	    	String newSecond = input.next();
	    	
	    	if(newSecond.equalsIgnoreCase("END")){
	    		
	    		newExit = false;}
	    	
	    	else{
	    		
	    		while (newExit == true){
				
					double e = Double.parseDouble(newFirst);
					double f = Double.parseDouble(newSecond);
					
					list.add(e,f);
					
					System.out.print("\nFirst: ");
					newFirst = input.next();
					
					if(newFirst.equalsIgnoreCase("END")){
						
						newExit = false;}
					else{
						System.out.print("Second: ");
						newSecond = input.next();
						
						if(newSecond.equalsIgnoreCase("END")){
							
							newExit = false;}
						else{
							newExit = true;}
						}
	    							}
    			}
    		}
    	StatisticsMenuManagerForPairs.statisticsMenuManager();
        }
    else if (choice==4)
        {
            /*
            Code to initiate actions associated to option 4.
            */

            exitMenu = true;
        }
        
    else {
    	
    	System.out.println("\nThis is not a valid option.");
    	StatisticsMenuManagerForPairs.statisticsMenuManager();
    	}
    }
}   
 
