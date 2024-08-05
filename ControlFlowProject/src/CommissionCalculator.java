import java.util.Scanner;

public class CommissionCalculator {
	public static void main(String[] args) {
		System.out.println("Esta app calcula de comisión del vendedor");
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa el monto de venta: ");
		double sales = in.nextDouble();
		double comission=0;
		
	
		if((sales>1000) && (sales<=5000)) {
			comission = sales * 0.1;
		}
		else if((sales>5000) && (sales<=10000)) {
			comission = sales * 0.2;
		}else if(sales>10000) {
			comission = sales * 0.3;
		}
		
	
		System.out.println("La comisión del vendedor es de: $" + comission);
		in.close();
		
	}//main
}//ComissionCalculator
