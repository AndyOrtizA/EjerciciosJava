
public class ArreglosDemo {
	public static void main(String[] args) {
		String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}//for i 
		System.out.println("==========================");
		for (String month: months) {
			System.out.println(month);
		}//foreach

	}//main
}//class ArreglosDemo
