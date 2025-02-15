import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	private static Priorities priorities = new Priorities();
	
	public static void main(String[] args) {
		System.out.println("Kaç input girilmeli? ");
		int inputCount = scan.nextInt();
		scan.nextLine();
		
		List<String> events = new ArrayList<>();
		
		for (int i = 0; i < inputCount; i++) {
			events.add(scan.nextLine());
		}
		
		List<Student> students = priorities.getStudents(events);
		
		if (students.isEmpty()) {
			System.out.println("EMPTY");
		}else {
			for (Student student : students) {
				System.out.println(student.getName());
			}
		}
		
		
		
		
	}

}
