package ninety_Days_Workout_java_Week1Day1;

public class Palindrome {

		    static boolean isPalindrome(String str) 
	    { 
	  
	        // Pointers pointing to the beginning 
	        // and the end of the string 
	        int i = 0, j = str.length() - 1; 
	  
	        // While there are characters toc compare 
	        while (i < j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
	        } 
	  
	        // Given string is a palindrome 
	        return true; 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        String str = "malayalam"; 
	        
	        //String str = "Tamil";
	  
	        if (isPalindrome(str)) 
	            System.out.print("Yes,the given string is palindrome"); 
	        else
	            System.out.print("No, the given string is not palindrome"); 
	    } 
	


	}

