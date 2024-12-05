package staticInitializerBlock;

import java.util.Scanner;

public class Solution {
	static int genislik;
	static int yukseklik;
	static boolean flag = true;
	
	static {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Paralelkenarın genişiliğini giriniz:  ");
	    genislik = scanner.nextInt();  // Create a Scanner object
	    System.out.println("Paralelkenarın yüksekliğini giriniz:  ");
	    yukseklik = scanner.nextInt(); 
	    scanner.close();
	    
	    
	    if(genislik <= 0 || yukseklik<=0 ) {
	    	flag = false;
	    	System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }

	    
	}
	
	
	
}
