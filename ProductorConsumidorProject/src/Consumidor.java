
public class Consumidor implements Runnable{
	private String name;
	public Consumidor(String name) {
		this.name=name;
	}//constructor
	
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public void run() {
		System.out.println("INICIO del Consumidor " + this.getName());
		int cont=0;
		while(cont<Almacen.max) {
			
			if(Almacen.lista.size()==0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//if size==0
			
			synchronized(Almacen.lista) {
				System.out.println(cont + " Consumidor" + this.getName() + " " + Almacen.lista.remove(0) + "tamaño: " + Almacen.lista.size());
			}//synchronized

			cont++;
		}//while
		System.out.println("************ FIN del Productor "+ this.getName());
	}//run
	
}//class Consumidor
