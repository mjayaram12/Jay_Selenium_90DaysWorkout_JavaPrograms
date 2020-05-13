package ninety_Days_Workout_java_Week1Day1;
import java.util.HashMap; 
public class Char_Occurence_GivenString_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "YOU HAVE NO CHOICE OTHER THAN FOLLOWING ME";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	} 
	    

	}


