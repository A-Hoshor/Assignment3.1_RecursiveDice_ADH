import java.util.Random;
public class RecDieRoller {

	private int face;
	private int count;
	private int countAvg=0;
	private int roll;
	private Random random = new Random();

	/**
	 * Constructor will create a RecDieRoller.
	 * We will not have a preferred argument constructor because we do not
	 * want to give the client the ability to program the dice to two.
	 */
	public RecDieRoller() {
		face=0;
	}//end constructor

	/**
	 * roll method will generate a random number between 1 and 6 for the face value.
	 * The face value will be printed to the screen and then the dice rolled again
	 * until the face is a two. Then, the roll method will complete, the count and face
	 * variables will be reset in order to roll again.
	 */
	public void roll() {
		/**
		 * Since we want the method to stop when the face is at 2, 
		 * that is our base case.
		 */

		if (face==2){
			System.out.println("The dice was rolled " + count + " times.");
			roll++;//for getAverage method
			count=0;//reset the count variable
			face=0;//reset the face variable
			return;
		}//end if
		face=random.nextInt(1,6);
		System.out.println(face);
		count++;
		countAvg++;//for getAverage method
		roll();//recursive call

	}//end roll method

	/**
	 * getAverage method takes the total number of times it took to get 2 and divides it 
	 * by the total number of times that the roll method is called in its method.
	 * @return String of the average amount of times it took to get to 2
	 */
	
	public String getAverage() {
		return "The average amount of times it took to get the number 2 is:\n" + countAvg/roll;
	}
	
	
}//end class
