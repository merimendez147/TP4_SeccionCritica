package BarberoDormilon;

public class Main {

	public static void main(String[] args){
		Barberia barberia = new Barberia("Barberia");
		Barbero barbero = new Barbero("Barbero",barberia);
		Cliente cliente = new Cliente("Cliente",barberia);
		Thread b= new Thread(barbero);
		Thread c= new Thread(cliente);
		b.start();
		c.start();

	}
}
