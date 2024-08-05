
public class Main
{
    public static void main( String[] args )
    {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        String courseId2 = "biol_01";
        String studentId2 = "458787";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);
        courseService.displayCourseInformation( courseId2 );
        courseService.displayStudentInformation( studentId2);

        courseService.enrollStudent( studentId, courseId );
        courseService.enrollStudent( studentId2, courseId );
        courseService.enrollStudent( studentId2, courseId2 );
        courseService.displayStudentInformation( studentId);
        courseService.displayStudentInformation( studentId2);

        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        
        
        courseService.totalCredits(studentId);
        courseService.totalCredits(studentId2);
    }


}
