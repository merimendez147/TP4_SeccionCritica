package BarberoDormilon;

public class Barbero implements Runnable{
	String nombre;
	Barberia miBarberia;
	
	public Barbero(String n, Barberia b){
		this.nombre=n;
		this.miBarberia=b;
	}

	private void atender(){
		System.out.println("Atendiendo al Cliente");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run(){
		while(true){
			miBarberia.esperarCliente();
			this.atender();
			miBarberia.terminarAtencion();
		}
	}
}
