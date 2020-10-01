package Punto9;

public class Taxita implements Runnable{
	String nombre;
	Taxi miTaxi;
	
	public Taxita(String n, Taxi t){
		this.nombre=n;
		this.miTaxi=t;
	}

	private void irDestino(){
		System.out.println("Llevando al pasajero a su destino");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run(){
		while(true){
			miTaxi.esperarPasajero();
			System.out.println("Un pasajero solicita ir a un destino");
			this.irDestino();
			miTaxi.terminarViaje();
			System.out.println("El pasajero llego a su destino");
		}
	}
}