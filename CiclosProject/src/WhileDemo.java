
public class WhileDemo {

	public static void main(String[] args) {
		int cont=0;
		while (cont<10) {
			System.out.println(cont);
			cont++;
		}//while cont
		System.out.println("=========break==========");
		cont=0;
		while (cont<10) {
			if(cont==8) {
				break;
			}
			System.out.println(cont);
			cont++;
		}//while cont
		System.out.println("=========continue==========");
		cont=0;
		while (cont<10) {
			if(cont==8) {
				cont++;
				continue;
			}
			System.out.println(cont);
			cont++;
		}//while cont
	}

}
