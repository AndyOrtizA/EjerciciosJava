public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       
       public Student(String firstName,String lastName, int registration, int grade, int year){
    	   this.firstName=firstName;
    	   this.lastName=lastName;
    	   this.registration= registration;
    	   this.grade=grade;
    	   this.year=year;
       }//constructor
       public Student(String firstName,String lastName, int registration){
    	   this(firstName, lastName , registration, 0, 0);
       }//constructor
       public Student(String firstName,String lastName){
    	   this(firstName, lastName , 0);
       }//constructor
       
       
       public void printFullName() {
    	   System.out.println(firstName + " " + lastName);
       }//printFullName
       
       public boolean isApproved() {
    	   if(grade>= 60 && grade<=100) {
    		   System.out.println("Is approved");
    		   return true;
    	   }else if(grade>100){
    		   System.out.println("Grade is not valid");
    	   }else {
    		   System.out.println("Is not approved");
    	   }//if
    	   return false;
       }//isApproved()
       
       public int changeYearIfApproved(){
    	   if(isApproved()) {
    		   System.out.println("Congratulations");
    		   return this.year++;
    	   }else {
    		   System.out.println("try again");
    	   }//if
    	   return this.year;   
       }//changeYearIfApproved
       
   }//Class Student


