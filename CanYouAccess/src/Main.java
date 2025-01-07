import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sayi; 
		
		while (true) {
			
			sayi = scanner.nextInt();
			
			if(sayi>= 1 && sayi<1073741824) {
				
				Solution.Inner.Private innerPrivate = new Solution.Inner.Private();
				innerPrivate.powerof2(sayi);
				
				break;
			}
			
			
			else {
				System.out.println("Girdiğiniz sayı 1 ile 2^30 arasında olmalı, tekrar giriş yapın: ");
			}
		}
		
		scanner.close();
	}

}
