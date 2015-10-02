/** This is the menu class. 
 * It is made to display "menu" like interfaces
 *
 * @author Nelson Alemar
 *
 */

public class Menu {
	
	private String content;
    //All the content of the menu displays as a String.
    
    private int nOptions;
    //Number of options in the menu. Ex: 1,...., nOptions.
    
    private int maxChances;
    //Max number of tries that this menu gives the user to enter a valid selection
    
    /**
     * Menu constructor
     * 
     * @param content will be what is displayed on the menu, as a string
     * @param nOptions number of options in the menu
     * @param maxChances sets the maximum numbers of tries before the program crashes
     */
    
    public Menu(String content, int nOptions, int maxChances)
    {
        this.content= content;
        this.nOptions= nOptions;
        this.maxChances= maxChances;
        
    }
    
    /**
     * This method is used to display "content" string object to the user.
     */
    
    public void display()
    {
        ProjectUtils.println(content);
        
    }
    
    /**
    Asks for and adds the user selection.
    @return Returns 0 if all the attempts allowed have been used by the user,
    without entering a valid selection. Otherwise, it returns an integer value
    corresponding to the valid selection done by the user.
    */
    
    public int getUserSelection()
    {
        int opportunity=0;
        boolean valid = false;
        int selection = 0;
        while(!valid && opportunity<maxChances)
            {
                opportunity++;
                ProjectUtils.print("Enter a valid selection for this menu: ");
                selection = ProjectUtils.readInteger();
                if(selection>=1&&selection<=nOptions)
                    valid=true;
            }
        if (!valid)
            return 0;
        else
            return selection;
    }
    
    /**
    Get the int value representing the exit option in menu
    @return the int value corresponding to the exit option
    */
    
    public int getExitChoice()
    {
        return nOptions;
    }
    
    

}
