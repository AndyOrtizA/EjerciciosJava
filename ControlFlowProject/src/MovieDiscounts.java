import java.util.Scanner;

public class MovieDiscounts {
	public static void main(String[] args) {
		 System.out.println("¿qué edad tienes?");
		 Scanner in = new Scanner(System.in);
		 byte edad= in.nextByte();
		 float ticket=7.0F;
		 
		 if (edad<5) {
			 ticket=(ticket-(ticket*0.60F)); // 60% de descuento
		 }else if (edad>60) {
			 ticket=(float)(ticket-(ticket*0.55)); // 60% de descuento
		 }else {
			 System.out.print("¿Cuantos boletos deseas?: ");
			 short cantidad = in. nextShort();
			 if(cantidad>=2) {
				 ticket=(float)((cantidad*ticket)*0.7);
			 }//if cantidad
		 }//else
		 System.out.println("EL costo total de el/los ticket(s) es: " + ticket);
		 in.close();
	}//main
}//MovieDiscounts
