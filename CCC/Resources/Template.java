
//DISCLAIMER CODE IS NOT MEANT TO BE USED AS STARTER CODE WITHIN THE CCC CONTEST.
//ONLY A LEARNING TOOL ON HOW TO FRAME YOUR CODE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//on the CCC your class name must be 'Main' and must not be within a package
public class Template {

	public static void main(String[] args) throws IOException {
		// this creates a buffered reader that will be the method for reading the data
		// given
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * with the CCC you will most likely have the data required be divided up by
		 * line this means that the most useful method to use with the BR would be the
		 * following
		 */
		in.readLine();
		/*
		 * returns a string that ends at the end of each line within the data to note a
		 * throws deceleration is required at the top of your code as seen by main
		 * Method.class Don't worry about it for now
		 */

		/*
		 * to take a line from the BR and turn it into an int use this on the read
		 * String
		 */
		Integer.parseInt(in.readLine());
		/* Also works for doubles and longs */

		/*
		 * for sorting arrays, use the built in sort within the arrays class. It is a
		 * fast quciksort and does not require any additional code to be written
		 */
		int[] arr = new int[3];
		Arrays.sort(arr);
		// sorts in ascending order

		/*
		 * if you are going to be using a HelperClass, which I would only recommend if
		 * you are more experienced the way you do is like this. Write your class
		 * outside of the main method but within the Main class. Make sure your
		 * HelperClass is formated properly. Then to instantiate your HelperClass you do
		 * this
		 */

		Template tp = new Template(); // first instantiate the Main class

		HelperClass hc = tp.new HelperClass(); // using the instantiated Main class you can now instantiate your
												// HelperClass

	}

	class HelperClass {
		public int data;

		public HelperClass() {
			/* constructor code goes here */
		}
	}

}
