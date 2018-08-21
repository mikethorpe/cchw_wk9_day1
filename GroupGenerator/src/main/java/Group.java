import java.util.ArrayList;

public class Group {

	private ArrayList<Student> groupStudents;
	private int groupSize;

	public Group(int groupSize){
		this.groupStudents = new ArrayList<>();
		this.groupSize = groupSize;
	}

	public boolean addStudent(Student student){
		if (groupStudents.size() < groupSize){
			groupStudents.add(student);
			return true;
		}
		return false;
	}

	public ArrayList<Student> getGroupStudents() {
		return groupStudents;
	}
}
