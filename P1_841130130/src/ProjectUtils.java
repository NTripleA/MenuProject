import java.util.Scanner;

/**This is the ProjectUtils class.
 * This is the class that redirects and operates most of the choices of the different menus chosen by the user. 
 * @author Nelson Alemar
 * 
 */

public class ProjectUtils {
	
		// the unique Scanner object to be used for input from 
		// the user throughout the program.

		private static final Scanner input = new Scanner(System.in);
		private static int countQuad = 0, countSingleStatistics = 0, 
				countPairStatistics = 0, countEncrypt = 0, countSplit = 0,
				countShow = 0;
		
		/**
		 *  Method for read and return an integer value
		 *  
		 * @return the integer that the user of the program has used
		 */
		
		public static int readInteger() { 
			return input.nextInt(); 
		}
		
		
		
		/** Methods for output
		 * 
		 * @param s prints out a string object
		 */
		
		public static void print(String s) { 
			System.out.print(s); 
		} 
		
		/**
		 * Methods for output
		 * 
		 * @param s prints out a string object, but goes to the next line on the terminal.
		 */
		
		public static void println(String s) { 
			System.out.println(s); 
		}

		/**
		 * Initiates the execution of the menu for operations with numbers. 
		 * This is to be executed each time the user selects option 1 in main
		 * menu. 
		 */
		
		public static void operationsOnNumbers() {
			NumbersMenuManager numbersMenuManager = NumbersMenuManager.getInstance(); 
			numbersMenuManager.run(); 
		}

		/**
		 * Initiates the execution of the menu for operations with strings. 
		 * This is to be executed each time the user selects option 2 in main
		 * menu. 
		 */
		
		public static void operationsOnStrings() {
			StringMenuManager stringMenuManager = StringMenuManager.getInstance(); 
			stringMenuManager.run(); 
		}

		/**
		 * Method to show statistics of usage. Executed whenever the user selects
		 * option 3 in main menu as per the specifications at the moment.
		 */
		
		public static void showStatistics() {
			
			countShow++;
			
			System.out.println("\nOperation in the program."+"\t\t\tNumber of Times Executed."
			+"\n\nProcess a Quadratic equation"+"\t\t\t\t"+countQuad
			+"\nCompute Statistics of Lists of Numbers"+"\t\t\t"+countSingleStatistics
			+"\nCompute Statistics of Lists of Pairs of Numbers"+"\t\t"+countPairStatistics
			+"\nEncrypt/Decrypt Strings"+"\t\t\t\t\t"+countEncrypt
			+"\nExtract Words from Strings"+"\t\t\t\t"+countSplit
			+"\nShow Statistics"+"\t\t\t\t\t\t"+countShow); 
			
		}

		/**
		 * Method to initiate the actions to read and encrypt a string. 
		 */
		
		public static void encryptAString() {
			
			countEncrypt++;
			String a,c,encrypt;
			int b;
			
			System.out.println("\nPlease input the string that you want to encrypt/decrypt: "); 
			c = input.nextLine(); //Dummy variable because the scanner is skipping the first nextLine() 
			a = input.nextLine();
			
			System.out.println("\nPlease input any key from -25 to 25: ");
			b = input.nextInt();
			
			
			
			encrypt = StringEncryptor.encryptString(a, b);
			
			System.out.printf("\nEncrypted String: %s \n",encrypt);
			
			
			
			
		}

		/**
		 * Method to initiate the actions to read a string split in words
		 * as specified. 
		 */
		
		public static void wordsInAString() {
			
			countSplit++;
			
			System.out.println("\nPlease enter a string that you wish to split in words: "); 
			String a = input.nextLine();
			String split = input.nextLine();
			
			StringSplitter stringSplit = new StringSplitter(split);
			
			String word = stringSplit.nextWord();
			
			while(!word.equals("")){
				System.out.println(word);
				word = stringSplit.nextWord(); 
			}
			
		}

		/**
		 * Method to initiate the actions to process a quadratic equation
		 * using user input
		 */
		
		public static void processQuadraticEquation() {
			
			countQuad++;
			
			System.out.println("\nProcess a Quadratic Equation"); 
			
			float a, b, c;
			
			System.out.print("\nEnter the coefficient of the second degree term: ");
			a = input.nextFloat();
			
			System.out.print("\nEnter the coefficient of the first degree term: ");
			b = input.nextFloat();
			
			System.out.print("\nEnter the constant's coefficient: ");
			c = input.nextFloat();
			
			QuadraticEquation equation = new QuadraticEquation(a,b,c);
			
			System.out.println("\nThe solution to the equation "+equation+" is:");
			equation.getRealSolutions();
			
		}

		/**
		 * Method that goes to the Statistics Menu Manager class to interact with a list of single numbers.
		 */
		
		public static void computeAverageOfNumbers() {
			
			countSingleStatistics++;
			
			StatisticsMenuManager.statistics();
				
			
		}
		
		/**
		 * Method that goes to the Statistics Menu Manager class to interact with a list of pairs numbers.
		 */
		
		public static void computeAverageOfPairsOfNumbers() {
			
			countPairStatistics++;
			
			StatisticsMenuManagerForPairs.statistics();
			
			
			
		}
}
