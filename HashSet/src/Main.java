import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kaç veri girilecek?");
		Scanner input = new Scanner(System.in);
		int dataLength = input.nextInt();
		
		String[] pairLeft = new String[dataLength];
		String[] pairRight = new String[dataLength];
		
		for (int i = 0; i < dataLength; i++) {
			pairLeft[i] = input.next();
			pairRight[i] = input.next();
		}
		
		HashSet<String> hSet = new HashSet<>();
		
		for (int i = 0; i < dataLength; i++) {
			hSet.add(pairLeft[i] + " " + pairRight[i]);
			System.out.println(hSet.size());         
		}
        
		 
	}
}
