import java.util.Scanner;

public  class Solution {
	
	
	
	public  static class Inner{
		
		public static class Private{
			
			
			 public void powerof2(int sayi) {
	                if (sayi > 0 && (sayi & (sayi - 1)) == 0) {
	                    System.out.println(sayi + " is power of 2");
	                } else {
	                    System.out.println(sayi + " is not power of 2");
	                }

	               
	                System.out.println("Solution.Inner.Private has been created");
	            }
		   
		}
		
	}
}
