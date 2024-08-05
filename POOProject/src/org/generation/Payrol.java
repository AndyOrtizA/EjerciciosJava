package org.generation;

import java.util.Date;

import org.generation.classes.Pagable;

public class Payrol {
	public static void printReceipt(Pagable emp) {
		System.out.println("+===================================================================+");
		System.out.println("| Recibo de pago de " + emp.getName());
		System.out.println("| RFC "+ emp.getRfc());
		System.out.println("| Departamento "+ emp.getDepartment());
		System.out.println("| Por la cantidad de MXB $"+ emp.calculateSalary(30));
		System.out.println("| Número de empleado " + emp.getId());
		System.out.println("| Fecha " + (new Date()));
		System.out.println("+===================================================================+");
	}//printReceipt
	
}//class Payrol
