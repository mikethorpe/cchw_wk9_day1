import java.util.ArrayList;
import java.util.Collections;

public class Cohort {

	private ArrayList<Student> students;

	public Cohort() {
		this.students = new ArrayList<>();
		this.students.add(new Student("Vicky"));
		this.students.add(new Student("Vicky"));
		this.students.add(new Student("Stoo"));
		this.students.add(new Student("Pat"));
		this.students.add(new Student("Kirstin"));
		this.students.add(new Student("Emil"));
		this.students.add(new Student("Molly"));
		this.students.add(new Student("Digory"));
		this.students.add(new Student("Robbie"));
		this.students.add(new Student("Ricardo"));
		this.students.add(new Student("Mark"));
		this.students.add(new Student("Mike"));
		this.students.add(new Student("Tahnee"));
		this.students.add(new Student("Euan"));
		this.students.add(new Student("Joanna"));
		this.students.add(new Student("Raphael"));
		this.students.add(new Student("Marcin"));
		this.students.add(new Student("Garry"));
		this.students.add(new Student("Gemma"));
		this.students.add(new Student("Bea"));
		this.students.add(new Student("The missing student"));

	}

	public Student getRandomStudent(){
		Collections.shuffle(students);
		return students.get(0);
	}

	public ArrayList<Student> getTwoRandomStudents(){
		Collections.shuffle(students);
		ArrayList<Student> twoRandomStudents = new ArrayList<>();
		twoRandomStudents.add(students.get(0));
		twoRandomStudents.add(students.get(1));
		return twoRandomStudents;

	}

}



