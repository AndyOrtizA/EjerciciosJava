package org.generation;

public class Trapecio implements FiguraGeometrica{
	
	private String nombre;
	private double baseMayor;
	private double baseMenor;
	private double ladoIzq;
	private double ladoDere;
	private double altura;
	public Trapecio(String nombre, double baseMayor, double baseMenor, double ladoIzq, double ladoDere, double altura) {
		super();
		this.nombre = nombre;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.ladoIzq = ladoIzq;
		this.ladoDere = ladoDere;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getLadoIzq() {
		return ladoIzq;
	}
	public void setLadoIzq(double ladoIzq) {
		this.ladoIzq = ladoIzq;
	}
	public double getLadoDere() {
		return ladoDere;
	}
	public void setLadoDere(double ladoDere) {
		this.ladoDere = ladoDere;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", ladoIzq="
				+ ladoIzq + ", ladoDere=" + ladoDere + ", altura=" + altura + "]";
	}
	@Override
	public double calcularArea() {
		return (altura*(baseMayor+baseMenor))/2;
	}
	@Override
	public double calcularPerimetro() {
		return ladoIzq+ladoDere+baseMayor+baseMenor;
	}
	
	
	
}
