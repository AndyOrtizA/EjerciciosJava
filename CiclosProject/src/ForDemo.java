import java.util.Iterator;

public class ForDemo {

	public static void main(String[] args) {
		
		for(int cont=0; cont<10; cont++) {
			System.out.println(cont);
		}//for cont
		
		System.out.println("===============");
		for(int cont=0; cont<10; cont++) {
			if(cont==8) {
				break;
			}//if 8
			System.out.println(cont);
		}//for cont
		System.out.println("================");
		for(int cont=0; cont<10; cont++) {
			if(cont==8) {
				continue;
			}//if 8
			System.out.println(cont);
		}//for cont
		
		
		
		
	}//main
}//class
