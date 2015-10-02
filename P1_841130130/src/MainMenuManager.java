/**
 * MainMenuManager class
 * 
 * Manages the main menu of the program. Redirects and processes as necessary.
 * 
 * @author Nelson Alemar
 *
 */

public class MainMenuManager {

	 private static MainMenuManager uniqueInstance = null;
	    private Menu menu;
	    
	    /**
	     * MainMenuManager constructor
	     * 
	     */
	        private MainMenuManager()
	        {

	        }
	        
	        /**
	         * Getter for MainMenuManager class
	         * 
	         * @return the "main menu" as a string.
	         */

	        public static MainMenuManager getInstance()
	        {
	            if(uniqueInstance==null)
	            {
	                uniqueInstance = new MainMenuManager();
	                String menuDisplay = "\n\tMenu: "
	                        +"\n\t1)Perform Operations on Numbers: "
	                        +"\n\t2)Perform Operations on Strings: "
	                        +"\n\t3)Show Usage Statistics: "
	                        +"\n\t4)Exit Program"+"\n ";
	                        
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
	     * This method "runs" the Main Menu according to user input.
	     * It redirects and processes accordingly.
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
	                    ProjectUtils.operationsOnNumbers();
	                }
	            else if (choice==2)
	                {
	                    /*
	                    Code to initiate actions associated to option 2.
	                    */

	                    ProjectUtils.operationsOnStrings();
	                }
	            if (choice==3)
	                {
	                    /*
	                    Code to initiate actions associated to option 3.
	                    */

	                    ProjectUtils.showStatistics();
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
