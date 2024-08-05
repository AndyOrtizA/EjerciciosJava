
public class CiclosAnidados {

	public static void main(String[] args) {
		int num = 3;
		System.out.println("==========Ejercicio 1=============");
		//Ejercicio1
		for( int i=0; i<num; i++) {
			for (int j=0; j<num; j++) {
				System.out.println((i+1) + " " + (j+1));
			}
		}
		
		
	
		System.out.println("==========Ejercicio 2=============");
		//Ejercicio2
		num = 6;
		for( int i=0; i<num; i++) {
			for (int j=0; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("==========Ejercicio 3=============");
		//Ejercicio3
		for( int i=num; i>0; i--) {
			for (int j=0; j<i ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
