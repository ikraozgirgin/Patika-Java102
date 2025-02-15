
public class Student {
	private String name;
	private double CGPA;
	private int id;
	
	public Student(String name, double cGPA, int id) {
		super();
		this.name = name;
		CGPA = cGPA;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public double getCGPA() {
		return CGPA;
	}

	public int getId() {
		return id;
	}

	
	
}
