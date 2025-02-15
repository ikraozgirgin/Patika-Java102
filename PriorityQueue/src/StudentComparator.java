import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {

		if (Double.compare(s1.getCGPA(), s2.getCGPA()) != 0) {
			return Double.compare(s2.getCGPA(), s1.getCGPA());
		}else if(! s1.getName().equals(s2.getName())) {
			return s1.getName().compareTo(s2.getName());
		}else {
			return Integer.compare(s1.getId(), s2.getId());
		}
		
	}

}
