package org.generation;

import org.generation.classes.Consultor;
import org.generation.classes.Employee;
import org.generation.classes.Person;
import org.generaton.exceptions.EmailFormatException;

public class Main {
	public static void main(String[] args) {
		
		Employee andrea = new Employee( "Andrea Ortiz", 21,"AndreaOrtiz@Gmail.com",
					"XAXX000000", "Domicilio conocido", "IT", 650.50);
		Employee arturo =new Employee("Arturo Solares", 22, "arturo@hotmail.com",
					"XAXX000000", "Casa", "IT", 450.50);
		Employee braulio = new Employee ("Braulio Alejo", 23, "arturo@hotmail.com",
				"XAXX000000", "Otra Casa", "IT", 500.00);
		
		try {
			arturo.setEmail("arturogmail.com");
		}catch(EmailFormatException e){
			System.out.println(e.getMessage());
		}//catch
		
		System.out.println(andrea.getSalary());
		System.out.println(andrea.toString());
		System.out.println(arturo.toString());
		System.out.println(braulio.toString());
		
		
		System.out.println(Employee.getTotal() + " personas en total");
		
		
		Consultor dania = new Consultor("Dania SA de CV de RL","XAXX000000",850);
		
		Payrol.printReceipt(andrea);
		Payrol.printReceipt(arturo);
		Payrol.printReceipt(braulio);
		
		Payrol.printReceipt(dania);
		
	}//main	
}//class Main
