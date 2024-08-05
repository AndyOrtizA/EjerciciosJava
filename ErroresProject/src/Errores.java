import java.util.Scanner;

public class Errores {
	public static void main(String[] args) {
		System.out.println("Escribe un número del 1 al 10: ");
		Scanner in =new Scanner(System.in);
		int num = in.nextInt();
		int[] numeros = {2,4,8,16,32,64,12,256,512};
		int a=10, b=num;
		try {
			for (int i=0;i<=numeros.length;i++) {
			System.out.println(numeros[i]);
			}//for i
			System.out.println(a/b);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Se intentó acceder a un índice incorrecto");
		}catch(ArithmeticException e){
			System.out.println("No se puede dividir entre ceros");
		}catch(Exception e) {
			System.out.println("Se ha producido un problema");
		}finally {
			System.out.println("close");
			in.close();
		}
		//catch
		
		System.out.println((numeros.length));
		System.out.println("prueba errores en tiempo de ejecución");
	}//main
}//class Errores

