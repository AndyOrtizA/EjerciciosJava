
public class Productor extends Thread{

	public Productor(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		System.out.println("INICIO del Productor " + this.getName());
		int cont=0;
		while(cont<Almacen.max) {
			int num = (int) (Math.random()*500);
			synchronized(Almacen.lista) {
				Almacen.lista.add(num);
			}//synchronized
			
			System.out.println(cont + " Productor " + this.getName() + " " + num + " tamaño: " + Almacen.lista.size());
			try {
				Thread.sleep(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cont++;
		}//while
		System.out.println("************ FIN del Productor "+ this.getName());
	}//run
	
}// class Productor
