import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasUnitarias {
	Calculadora cal = new Calculadora();
	
	@Test 
	@DisplayName("Prueba para capturar una excepción")
	void pruebaException() {
		assertEquals(3, cal.divide(9, 3));
		assertEquals(5, cal.divide(25, 5));
		Exception e = assertThrows(ArithmeticException.class, ()-> cal.divide(10,0));
		assertEquals("/ by zero", e.getMessage());
		
	}//pruebaExcption
	
	
	
	@Test 
	@DisplayName("Prueba que el valor no sea Nulo")
	void pruebaString() {
		assertNotNull(cal.getStrPI());
	}//pruebaString
	
	@Test 
	@DisplayName("Prueba que el valor de PI se encuentre dentro de un rango aceptable")
	void pruebaBoolena() {
		assertTrue(cal.getPI()>=3.14);
		assertTrue(cal.getPI()<=3.1416);
	}//pruebaBoolena

	@Test
	@DisplayName("Prueba la suma de dos números enteros")
	void pruebaSumaEnteros() {
		assertEquals(4, cal.suma(2, 2));
		assertEquals(256, cal.suma(128, 128));
		assertEquals(64, cal.suma(32, 32));
		assertEquals(73, cal.suma(50, 23));	
	}//pruebaSumaEnteros,

}//class PruebasUnitarias
