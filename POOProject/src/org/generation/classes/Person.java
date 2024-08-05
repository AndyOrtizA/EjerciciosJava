package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.generaton.exceptions.EmailFormatException;
/**
 * Clase abstracta no puede instanciarse solo heredarse 
 * 
 */
public abstract class Person {
	private String name;
	private int age;
	private String email; 
	private String rfc; 
	private String address;
	private int id;
	private static int total=0;
	
	/**
	 * Constructor para instanciar una persona 
	 * (No se puede directo sólo en la clase heredada"
	 * @parram name nombre de la persona
	 * @param age  Edad de la persona
	 * @param email correo electronico de la persona
	 * @param rfc Registro federal 
	 * @param address Dirección completa de la persona 
	 */
	public Person(String name, int age, String email, String rfc, String address) {
		this.name = name.toUpperCase();
		this.age =(age<18)?18:age;
		this.email = email.toLowerCase();
		this.rfc = rfc;
		this.address = address;
		
		Person.total++;
		this.id = Person.total;
	}//constructor
	
	public Person(String name, int age, String email) {
		this(name,age,email,"XAXX000000", "Sin domicilio");
	}//constructor
	
	public Person(String name) {
		this(name,0,"sincorreo@correo.com");
	}//constructor
	
	public static int getTotal(){
		return total;
	}
	
	public String getEmail(){
		return this.email;
	}//getEmail
	
	/**
	 * Establece un correo electrónicpo para la persona, realiza una validación de formato 
	 * en caso de no tener el formato requerido se asigna por default sin@correo.com
	 * @param email
	 * @throws EmailFormatException  si el correo electrónico no cumple con el formato 
	 */
	public void setEmail(String email) throws EmailFormatException {
		Pattern regex =Pattern.compile("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
		Matcher m=regex.matcher(email);
		if(m.matches()) {
			this.email=email;
		}else{
			throw new EmailFormatException(email +" no es un formato de correo electrónico válido");
		}//if mactches 
	}//setEmail
	public int getAge(){
		return this.age;
	}//getAge
	public void setAge(int age) {
		this.age=(age<18?18:age);
	}//setAge
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ "]";
	}

	
	
	
	
}//class Person 
