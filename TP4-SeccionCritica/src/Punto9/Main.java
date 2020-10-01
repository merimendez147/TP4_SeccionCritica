package Punto9;

public class Main {
	public static void main(String[] args){
		Taxi taxi = new Taxi("Taxi");
		Taxita taxita = new Taxita("Taxita",taxi);
		Pasajero pasajero = new Pasajero("Pasajero",taxi);
		Thread t= new Thread(taxita);
		Thread p= new Thread(pasajero);
		t.start();
		p.start();

	}
}
