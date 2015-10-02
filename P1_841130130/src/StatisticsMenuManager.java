import java.util.Scanner;

/**This is the StatisticsMenuManager class.
 * 
 * This class includes the options that will manage or modify a list of single numbers
 * 
 * @author Nelson Alemar
 * 
 * 
 */

public class StatisticsMenuManager {
	
	private static Scanner input = new Scanner(System.in); // This will be the only scanner object used throughout the class
	private static DataSet list = new DataSet(); // This will be the DataSet used for the class, it's static so it's value will never reset and always remains
 
	/**
	 * This is the principal operation of the second option of the Numbers Menu Manager.
	 * You enter a list of numbers and when you enter "END", it redirects you to the 
	 * statisticsMenuManager method.
	 */
	
    public static void statistics(){
    	
    	
		String set;
    		
		System.out.print("\nEnter a list of numbers one by one. If done, enter 'END': ");
		set = input.next();
			
		while (!set.equalsIgnoreCase("END")){
				
				double num = Double.parseDouble(set);
				list.add(num);
				set = input.next();
		}
		
		StatisticsMenuManager.statisticsMenuManager();
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
           
            exitMenu = true;
        }
    else if (choice==1)
        {
            /*
            Code to initiate actions associated to option 1.
            */
           System.out.println("\nThe average of the numbers of the current list is: "+list.getAverage());
           
           StatisticsMenuManager.statisticsMenuManager();

        }
    else if (choice==2)
        {
            /*
            Code to initiate actions associated to option 2.
            */
    		System.out.println("\nThe standard deviation of the current list is: "+list.getSD());
    		StatisticsMenuManager.statisticsMenuManager();
        }
    else if (choice==3)
        {
            /*
            Code to initiate actions associated to option 3.
            */
    	
    	System.out.print("Please enter more numbers to add to the list. Enter 'END' when done: ");
    	String newSet = input.next();

    	while (!newSet.equalsIgnoreCase("END")){
			
			double newNum = Double.parseDouble(newSet);
			list.add(newNum);
			newSet = input.next();
			}
    	
    	StatisticsMenuManager.statisticsMenuManager();
    	
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
