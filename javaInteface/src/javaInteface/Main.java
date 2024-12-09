package javaInteface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Değer girin: ");
		int deger = scanner.nextInt();
		
		if (deger>1000) {
			System.out.println("Değer 1000'den büyük olamaz!");
			scanner.close();
			return;
		}
		
		
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.divisorSum(deger);
		
		scanner.close();
		
		

	}

}
