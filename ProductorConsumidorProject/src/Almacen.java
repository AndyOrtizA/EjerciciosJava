import java.util.ArrayList;

public class Almacen {
	public final static ArrayList<Integer> lista = new ArrayList<Integer>(); //Es estatica y el final es para decir que es una constante
	public final static int max= 100;
	
	public static void main(String[] args) {
		Productor prod1 = new Productor("Productor 1");
		Consumidor cons1 = new Consumidor("Consumidor 1");
		Thread t1 = new Thread(cons1);
		
		prod1.start();
		t1.start();

	}//main
}//class Almacen 
