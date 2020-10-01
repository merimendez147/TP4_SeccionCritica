package Punto9;

public class Pasajero implements Runnable{
	String nombre;
	Taxi elTaxi;
	
	public Pasajero (String n, Taxi t){
		this.nombre=n;
		this.elTaxi=t;
	}
	
	public void run(){
		if (elTaxi.entrar(nombre)){
			elTaxi.solicitarTaxi(nombre);
			elTaxi.salir();
			System.out.println("El pasajero sale del taxi");
		}
	}
}