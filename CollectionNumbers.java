import java.util.ArrayList;

public class CollectionNumbers {
	
		public static int total(ArrayList<Integer> num) { 
			
			num.add(10);
			num.add(123);
			num.add(38);
			num.add(1999);
			
			int sum = 0; 
			
		for (int i = 0; i<num.size(); i++) { //iterate
			sum+=num.get(i); //update the previous value that we initialize
			}
		return sum;
		}
	}
