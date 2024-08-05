package org.generation.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.generation.exceptions.CourseNotFoundException;
import org.generation.exceptions.StudentNotFoundException;

public class StudentService
{
    private HashMap<String, Course> courseList = new HashMap<>();
    private HashMap<String, Student> students = new HashMap<>();
    private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService(){
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }//constructor 

    public void enrollStudents( String courseName, String studentID ) 
    		throws CourseNotFoundException, StudentNotFoundException{
    	if(! courseList.containsKey(courseName)) {
    		throw new CourseNotFoundException();
    	}//!contains
    	if(! students.containsKey(studentID)) {
    		throw new StudentNotFoundException();
    	}//!contains
    	
        Course course = courseList.get( courseName );
        if ( !coursesEnrolledByStudents.containsKey( studentID ) ){
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }

    public void unEnrollStudents( String courseName, String studentID )
    		throws CourseNotFoundException, StudentNotFoundException{
    	if(! courseList.containsKey(courseName)) {
    		throw new CourseNotFoundException();
    	}//!contains
    	if(! students.containsKey(studentID)) {
    		throw new StudentNotFoundException();
    	}//!contains
        Course course = courseList.get( courseName );
        if ( coursesEnrolledByStudents.containsKey( studentID ) ){
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseId){
        //TODO implement using collections loops
    	System.out.println(courseId + "enrolled: ");
    	Course course = courseList.get(courseId);
    	for (String studentId: coursesEnrolledByStudents.keySet()) {
    		List<Course> allCourses=coursesEnrolledByStudents.get(studentId);
    		if(allCourses.contains(course)) {
    			Student student =students.get(studentId);
    			System.out.println(student);
    		}//if contains  		
    	}// foreach
    }// showEnrolledStudents

    public void showAllCourses(){
        //TODO implement using collections loops
    	for (String key: courseList.keySet()) {
			System.out.println(courseList.get(key));
		}
    }
    
    public void addStudent(Student student){
    	students.put(student.getId(), student);
    	
    }// addStudent
	
}// class StudentService