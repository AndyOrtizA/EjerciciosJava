import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> colores = new HashMap<String, String>();
		// Red Green Blue
		colores.put("RED", "#FF0000");
		colores.put("GREEN", "#00FF00");
		colores.put("BLUE", "#0000FF");
		colores.put("WHITE", "#FFFFFF");
		colores.put("BLACK", "#000000");
		colores.put("FUCHSIA", "#FF00FF");
		colores.put("PINK", "#FFC8CB");
		colores.put("YELLOW", "#FFFF00");
		colores.put("CYAN", "#00FFFF");
		
		System.out.println(colores.put("NAVY", "#000080"));//null
		System.out.println(colores.put("NAVY", "#000088"));//#000080
		
		
		System.out.println(colores.size());//10
		System.out.println(colores.get("CYAN"));
		//System.out.println(colores.get("CYAN1"));
		
		for (String v: colores.values()) {
			System.out.println(v);
		}
		
		for (String k: colores.keySet()) {
			System.out.println(k);
		}
		
		colores.forEach((k,v) -> mostrar(k,v));
	}//

	private static void mostrar(String k, String v) {
		System.out.println("+------------------------------");
		System.out.println("| "+ k + " --> "+ v);
		System.out.println("+------------------------------");
	}
}//
