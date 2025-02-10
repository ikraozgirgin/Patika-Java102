import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());
		
		students.add(new Student("İkra" , 99));
		students.add(new Student("Ömer" , 100));
		students.add(new Student("Aslı" , 20));
		students.add(new Student("Bekir" , 70));
		students.add(new Student("Serhat" , 89));
		
		for (Student student : students) {
			System.out.println(student.getName());
		}
		
	}

}
