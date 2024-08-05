
public class Calculadora {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		
		int res= cal.sum(8,45);
		System.out.println(res);
		System.out.println(cal.sum(3.1416, 1.2));
		res= cal.sum(8,45,123);
		System.out.println(res);
		
		res  = cal.multiplica(10,100);
		System.out.println(res);
		
		res = cal.resta(2100, 1345);
		System.out.println(res);
		
		res = cal.divide(10, 2);
		System.out.println(res);
	
	}//main
	public double sum(double a, double b) {
		double c= a+b;
		return c;
	}//sum 2 parametros double
	
	public int sum(int a, int b) {
		int c= a+b;
		return c;
	}//sum 2 parametros int 
	
	public int sum(int a, int b, int c) {
		int d= a+b+c;
		return d;
	}//sum 3 parametros 
	
	public int multiplica(int a, int b) {
		return (a*b);
	}//multiplica
	
	public int resta(int x, int y) {
		return (x-y);
	}//resta
	
	public int divide(int x, int y) {
		return (x/y);
	}//divide

}//class Calculadora
