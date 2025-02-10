import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kaç satır çalışsın ?");
		int firstLineLength = input.nextInt();
		List<List<String>> listBase = new ArrayList<>();
		
		for (int j = 0; j < firstLineLength; j++) {
			
			int list1Length = input.nextInt();
			List<String> list1 = new ArrayList<>();

			for (int i = 0; i < list1Length; i++) {
				list1.add(input.next());
			}
			
			listBase.add(list1);
			
		}
		
		System.out.println("Kaç sorgu çalışsın ?");
		int queryCount = input.nextInt();
		
		 List<String> results = new ArrayList<>();
		for (int i = 0; i < queryCount; i++) {	
			int x = input.nextInt();
			int y = input.nextInt();
			
			try {
				String result =  listBase.get(x- 1).get(y - 1);
				results.add(result);
			} catch (Exception e) {
				results.add("ERROR!");
			}
			
	
		}
			
		for (String result : results) {
			System.out.println(result);
		}
		
		
		
	}

}
