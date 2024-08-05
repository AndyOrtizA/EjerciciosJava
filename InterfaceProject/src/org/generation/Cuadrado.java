package org.generation;

public class Cuadrado implements FiguraGeometrica{
	private String nombre;
	private double lado;
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}


	@Override
	public double calcularArea() {
		
		return Math.pow(lado, 2);
	}


	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}
	
	
	
	

}//class Cuadrado
