
public class TiposPrimitivos {
	public static void main(String[] args) {
		// así podemos definir deferentes tipos de variables y del mismo tipo
		byte edad=21, edad2;
		short suma=255, resta; 
		char inicial='A'; ///en char se usa unicamente comillas sencillas
		int min=19;
		boolean flag = true; //false;
		//Conversión explícita entre byte y short
		edad=(byte)suma;
		System.out.println(edad);
		edad=(byte)min;
		System.out.println(edad);
	}//main
}//class TiposPrimitivos  
