/**
 * This is a class to encrypt strings using parameters given on methods.
 * 
 * @author Nelson Alemar
 *
 */

public class StringEncryptor {
	
	private static final int ALENGHT=26;
	
    /**
    Encrypt string using a given key value.
    @param s the string to be encrypted
    @param key the key
    @return the encrypted string.
    */
    
    public static String encryptString(String s, int key)
    {
    	String newString;
    	char e;
    	
    	
        /*
        If the key value is not in the accepted range of (-25,25)
        the encrypted string is the same as the input string.
        */
    	
        if(key<-25||key>25){
            return s;
        }
        
        /*
        The key is valid, construct the encrypted string.
        */
        
        else{
        	
        	newString = "";
        	
        	for(int i = 0; i < s.length(); i++){
        		
        		char c = (char) (s.charAt(i));
        		
        		if (c >= 'A' && c <= 'Z'){
        			
        			e = StringEncryptor.encryptChar(c, key);
        			
        			newString = newString + e;
        			
        		}
        		
        		else if (c >= 'a' && c <= 'z'){
        			
        			e = StringEncryptor.encryptChar(c, key);
        				
        			newString = newString + e;	
        				
        			}
        		
        		else {
        			
        			newString = newString + c;
        			
        		}
        	}
        		
        }
        
        
        return newString;
                
    }
    
    /**
    Encrypt a particular character
    @param ch the character to encrypt- assumed to be a letter 'a'..'z' or 'A'..'Z'
    @param key the key to be used. It is assumed to be a value in range (-25,25)
    @return the new character after encryption
    */
    
    private static char encryptChar(char ch, int key)
    {
        int base;
        if(Character.isUpperCase(ch)){
  
            base= (int)'A';
        }
        else{
            base= (int) 'a';
        }
        
        return (char)(Math.abs((((int)ch-base)+key+ALENGHT)%ALENGHT)+base);
    }

}
