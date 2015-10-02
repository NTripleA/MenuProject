/**
 * StringMenuManager class
 * 
 * @author Nelson Alemar
 *
 */

public class StringMenuManager {
	
	 private static StringMenuManager uniqueInstance = null;
	    private Menu menu;
	    
	    /**
	     * StringMenuManager constructor
	     */
	    
	        private StringMenuManager()
	        {

	        }
	        
	    /**
	     * Getter for the StringMenuManager class
	     * 
	     * @return the menu as a string for the user to see and choose an option
	     */

	        public static StringMenuManager getInstance()
	        {
	            if(uniqueInstance==null)
	            {
	                uniqueInstance = new StringMenuManager();
	                String menuDisplay = "\n\tString Menu: "
	                        +"\n\t1) Encrypt/Decrypt string: "
	                        +"\n\t2) Show words on given strings. "
	                        + "\n\t3) Go back to Main Menu"+"\n ";
	                /*
	                Creates a menu object as per the specs of the main menu. It has
	                4 options and the implementation for the user to select
	                a valid option, there are a maximum of 3 opportunities.
	                */
	                uniqueInstance.menu= new Menu(menuDisplay, 3,3);
	            }
	            return uniqueInstance;
	        }
	        
	 /**
     *  This method "runs" the menu according to user input, and redirects to the specified option chosen by the same user.
     *  
     */
	        
	    public void run(){
	        boolean exitMenu= false;
	        do{
	            menu.display();
	            int choice= menu.getUserSelection();
	            /*
	            The above method call will return 0 if th user did not enter a valid
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
	                    ProjectUtils.encryptAString();
	                }
	            else if (choice==2)
	                {
	                    /*
	                    Code to initiate actions associated to option 2.
	                    */

	                    ProjectUtils.wordsInAString();
	                }
	            if (choice==3)
	                {
	                    /*
	                    Code to initiate actions associated to option 3.
	                    */

	                    exitMenu= true;
	                }
	           
	            
	        } while(!exitMenu);
	    }
}
