import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

	
	
	List<Student> getStudents(List<String> events){
		
		PriorityQueue<Student> queue = new PriorityQueue<>(new StudentComparator());
		
		for (String event : events) {
			String[] parts = event.split(" ");
			
			if (parts[0].equals("ENTER")) {
				String name = parts[1];
				double CGPA = Double.parseDouble(parts[2]);
				int id = Integer.parseInt(parts[3]);
				
				queue.add(new Student(name, CGPA, id));
				
			}else if(parts[0].equals("SERVED")) {
				queue.poll();
			}
			
		}
		
		List<Student> remainingStudents = new ArrayList<>();
	
		
		while (! queue.isEmpty()) {
			remainingStudents.add(queue.poll()); 
		}
		
		 
		return remainingStudents;
		
	}
	
}
