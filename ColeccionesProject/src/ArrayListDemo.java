import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(35);
		numeros.add(33);
		numeros.add(42);
		numeros.add(10);
		numeros.add(14);
		numeros.add(19);
		numeros.add(27);
		numeros.add(44);
		numeros.add(26);
		numeros.add(31);
		numeros.add(27);
		
		System.out.println(numeros.size());
		
		System.out.println(numeros.get(5));
		
		// numeros.clear(); // Elimina todos lo elementos del Arraylist
		System.out.println(numeros.size()); // 0 // 11
		System.out.println(numeros.isEmpty()); // true //  false
		///////////
		System.out.println(numeros.indexOf(27)); // 6
		System.out.println(numeros.lastIndexOf(27)); // 10
		System.out.println(numeros.indexOf(1400));// -1
		System.out.println(numeros.contains(44)); // true
		
		System.out.println(numeros.set(10, 7));
		System.out.println(numeros.remove(numeros));
		
		System.out.println("==============");
		
		/*
		 * for (Integer num : numeros) { System.out.println(num); }//foreach
		 */
		
		numeros.forEach((num)-> imprimirParesImpares(num));
		
	}//main

	private static void imprimirParesImpares(Integer num) {
		if (num%2==0) {
			System.out.println(num+ " es número par");
		} else {
			System.out.println(num + " es número impar");
		}
	}
}//Class ArrayListDemo
