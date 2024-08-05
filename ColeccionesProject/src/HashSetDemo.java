import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> autos= new HashSet<String>();
		
		System.out.println(autos.add("Volvo"));
		System.out.println(autos.add("BMW"));
		System.out.println(autos.add("VM"));
		System.out.println(autos.add("Ford"));
		System.out.println(autos.add("Audi"));
		System.out.println(autos.add("BMW"));
		
		System.out.println("BMw".hashCode());
		
		System.out.println(autos.size());
		
		System.out.println(autos.contains("BMW"));
		
		for(String auto :autos) {
			System.out.println(auto);
		}//foreach
		
		
		
		autos.clear();
		System.out.println(autos.isEmpty());
	}// main

}// class HashSetDemo
