
public class RecDieRollerDriver {
/**
 * A class to test the RecDieRoller class.
 * @param args
 * @author Alyssa Hoshor
 */
	public static void main(String[] args) {
	
		/**
		 * Instantiate an new RecDieRoller and test the roll method 
		 * by calling it 1,000 times.
		 */
		RecDieRoller test = new RecDieRoller();
		for (int i=0; i<100; i++) {
			test.roll();
			
		}//end for loop
		/**
		 * Test the getAverage method for the 
		 * test RecDieRoller.
		 */
		System.out.println(test.getAverage());
	}//end main method

}//end RecDieRollerDriver class
