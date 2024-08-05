import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa tu nombre: ");
		String nombre = in.nextLine();
		System.out.print("Ingresa la calificación: ");
		int testScore = in.nextInt();
		
		
		char grade;
		if ((testScore >= 90) && (testScore<=100)) {
			grade='A';
		}else if ((testScore >= 80) && (testScore < 90)) {
			grade='B';
		}else if ((testScore >= 70) && (testScore < 80)) {
			grade='C';
		}else if ((testScore >= 60) && (testScore < 70)) {
			grade='D';
		}else if ((testScore >= 0) && (testScore < 60)) {
			grade='D';
		}else {
			System.out.println("Calificación no válida");
			grade=' ';
		}// if else
		System.out.println("Grade = " + grade);
		in.close();
		
	}//main
}//IfElseDemo
