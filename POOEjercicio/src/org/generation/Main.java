package org.generation;

///https://github.com/generation-org/JAVA/tree/master/Object%20Oriented%20Programming%20-%20Advanced

import org.generation.classes.Student;
import org.generation.classes.StudentService;
import org.generation.exceptions.CourseNotFoundException;
import org.generation.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    
	    
        studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(new Student( "Ian", "1040", 28 ) );
        studentService.addStudent(new Student( "Elise", "1050", 26 ) );
        studentService.addStudent(new Student( "Santiago", "1020", 33 ) );
        
        
        try {
			studentService.enrollStudents( "Math", "1030" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        studentService.showAllCourses();
    }
}
