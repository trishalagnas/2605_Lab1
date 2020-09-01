
public class Recursion {

	public static void main(String[] args) {
		tableOfSquares(0,5); 
	}
		static void tableOfSquares(int n) {
			for (int nums=1; nums<=n; nums++) {  //iterate
				System.out.println("Square of "+ nums +" is " + nums*nums );	
			}
		}
		
		static void tableOfSquares(int nums, int n) {
				if(nums< n || nums==n) {  //recursion
	
				System.out.println("Square of "+ nums +" is " + nums*nums );
				tableOfSquares(++nums ,n);
				
			}else
				return;

	
		}
}

