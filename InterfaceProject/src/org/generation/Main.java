package org.generation;

public class Main {
	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("Tri+anguloTE", 250, 175, 145);
		Cuadrado  c = new Cuadrado("Cuadrado", 5);
		Rectangulo rec= new Rectangulo("Rectanfulo",4,8);
		Rombo rombo = new Rombo("Rombo", 20,10,10);
		Romboide rom = new Romboide("Romboide", 20, 20);
		Trapecio trap = new Trapecio("Trapecio", 10,5,2,2, 1);
		
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(c);
		imprimirCalculo(rec);
		imprimirCalculo(rombo);
		imprimirCalculo(rom);
		imprimirCalculo(trap);

	}//Main
	
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+=========================");
		System.out.println("|El área de [" + f.getNombre()
				+ "] Ses :" + f.calcularArea());
		System.out.println("|El perímetro de [" + f.getNombre()
				+ "] es :" + f.calcularPerimetro());
		System.out.println("+=========================");
	}
}//Class Main
