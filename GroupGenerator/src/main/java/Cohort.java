import java.util.ArrayList;
import java.util.Collections;

public class Cohort {

	private ArrayList<Student> students;
	private ArrayList<Group> groups;

	public Cohort() {
		this.students = new ArrayList<>();
		this.groups = new ArrayList<>();
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

	public ArrayList<Group> getGroups(int groupsize) {
		createAllGroups(groupsize);
		return groups;
	}

	private void createAllGroups(int groupSize){
		Collections.shuffle(students);

		// Clear the list of groups before we create a new set of groups
		groups.clear();
		int groupCounter = 0;

		for (Student student : this.students ) {

			// Create a new group for the first student on the list of students
			if (groups.size() == 0){
				groups.add(new Group(groupSize));
			}

			boolean addedToGroup = groups.get(groupCounter).addStudent(student);

			// If the current group if full then create a new, empty group and add the student to it
			if (addedToGroup == false){
				groups.add(new Group(groupSize));
				groupCounter++;
				groups.get(groupCounter).addStudent(student);
			}
		}

	}

}





