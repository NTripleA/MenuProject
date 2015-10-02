/**
 * This is the NumbersMenuManager class
 * 
 * @author Nelson Alemar
 *
 */

public class NumbersMenuManager {
	
	private static NumbersMenuManager uniqueInstance = null;
    private Menu menu;
    
    /**
     * This is the NumbersMenuManager constructor
     */
    
    private NumbersMenuManager()
        {

        }
    
    /**
     *  Getter method for the NumbersMenuManager class
     *  
     * @return the menu as a string for the user to see and choose an option
     */

    public static NumbersMenuManager getInstance()
        {
            if(uniqueInstance==null)
            {
                uniqueInstance = new NumbersMenuManager();
                String menuDisplay = "\n\tNumbers Menu: "
                        +"\n\t1) Process quadratic equation: "
                        +"\n\t2) Compute statistics on list of numbers: "
                        +"\n\t3) Compute statistics on list of pairs of numbers: "
                        +"\n\t4) Go back to Main Menu"+"\n ";
                /*
                Creates a menu object as per the specs of the main menu. It has
                4 options and the implementation for the user to select
                a valid option, there are a maximum of 3 opportunities.
                */
                uniqueInstance.menu= new Menu(menuDisplay, 4,3);
            }
            return uniqueInstance;
        }
    
    /**
     *  This method "runs" the menu according to user input, and redirects to the specified option chosen by the same user.
     *  
     */
    
    public void run()
    {
        boolean exitMenu= false;
        do{
            menu.display();
            int choice= menu.getUserSelection();
            /*
            The above method call will return 0 if the user did not enter a valid
            selection within the 3 established opportunities, otherwise
            it is valid
            */
            if (choice==0)
                {
                    /*
                    here the user is notified that he has failed to enter a valid
                    selection within the 3 attempts and the program terminates.
                    */
            		System.out.println("You have failed to enter a valid selection.");
                    exitMenu= true;
                }
            else if (choice==1)
                {
                    /*
                    Code to initiate actions associated to option 1.
                    */
                    ProjectUtils.processQuadraticEquation();
                }
            else if (choice==2)
                {
                    /*
                    Code to initiate actions associated to option 2.
                    */

                    ProjectUtils.computeAverageOfNumbers();
                }
            if (choice==3)
                {
                    /*
                    Code to initiate actions associated to option 3.
                    */

                    ProjectUtils.computeAverageOfPairsOfNumbers();
                }
            if (choice==4)
                {
                    /*
                    Code to initiate actions associated to option 4.
                    */

                    exitMenu= true;
                }
            
        } while(!exitMenu);
    }
}
