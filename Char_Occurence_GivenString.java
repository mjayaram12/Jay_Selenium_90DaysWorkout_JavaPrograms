package ninety_Days_Workout_java_Week1Day1;

public class Char_Occurence_GivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "YOU HAVE NO CHOICE OTHER THAN FOLLOWING ME"; 
        char c = 'O'; 
        System.out.println(count(str, c)); 
	}
		public static int count(String s, char c) 
	    { 
	        int res = 0; 
	  
	        for (int i=0; i<s.length(); i++) 
	        { 
	            // checking character in string 
	            if (s.charAt(i) == c) 
	            res++; 
	        }  
	        return res; 
	    }	
}
	



