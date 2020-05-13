package ninety_Days_Workout_java_Week1Day1;

public class Palindrome_UsingTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Verify the reverse and original are same
		String str = "testleaf";
		// Creating an empty String to store the reversed value
		String rev = "";
		// Iterate over the original string
		for (int i = str.length()-1 ; i >=0; i-- ) {
			rev += str.charAt(i);
		}
		// Condition ? True Statement : False Statement
		System.out.println(str.equals(rev)?"Yes, Palindrome":"No, Not a Palindrome");
	}
	}


