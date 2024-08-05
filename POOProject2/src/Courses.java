
import java.util.ArrayList;
import java.util.List;

public class Courses {
	String courseName;
	String professorName;
	int year; 
	List<Student> enrolled =new ArrayList<Student>();
	
	public Courses(String courseName, String professorName, int year) {
		this.courseName=courseName;
		this.professorName=professorName;
		this.year=year;
	}//constructor
	
	public void enroll(Student student) {
		enrolled.add(student);
	}//enroll
	
	public void enroll(Student[] students) {
		for(Student student : students) {
			enroll(student);
		}//foreach
	}//enroll
	
	public void unEnroll(Student student) {
		if(enrolled.contains(student)) {
			enrolled.remove(student);
		}//if
	}//unEnroll
	
	public int countStudents() {
		return enrolled.size();
	}//countStudents 
	
	public int bestGrade() {
		int best=0;
		for(Student student: enrolled) {
			if(student.grade>best) {
				best=student.grade;
			}
		}
		return best;
	}//bestGrade
	

}
