
public class Main {

	public static void main(String[] args) {
		Student vero = new Student("Vero", "Bedolla", 0, 65, 1);
		Student leonardo = new Student ("Leonardo", "León", 0, 45, 1);
		Student[] students= {
				//agregar estudiantes
		};
		Courses java =new Courses("Java", "Gossling", 1);
		//java.enroll(students);
		java.enroll(vero);
		java.enroll(leonardo);
		
		System.out.println(vero.changeYearIfApproved());
		System.out.println(leonardo.changeYearIfApproved());
		
		
		//java.unEnroll(leonardo);
		
		System.out.println(java.bestGrade());
		System.out.println(java.countStudents());
		
		vero.printFullName();
		leonardo.printFullName();
	}//main
}//class Main
