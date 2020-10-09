package Punto9;

import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class Taxi {
	Semaphore semTaxita;
	Semaphore semTaxi;
	Semaphore semSalida;
	String miNombre;

	public Taxi(String nombre) {
		miNombre = nombre;
		semTaxi = new Semaphore(1);
		semTaxita = new Semaphore(0);
		semSalida = new Semaphore(0);
	}

	public boolean entrar(String n) {
		return (semTaxi.tryAcquire());
	}

	public void solicitarTaxi(String n) {
		semTaxita.release(); // el pasajero despierta al taxita
		try {
			semSalida.acquire(); // el pasajero no se puede bajar del taxi hasta
									// llegar a destino
		} catch (InterruptedException e) {
			Logger.getLogger(Taxi.class.getName()).log(null);
		}
	}

	public void esperarPasajero() {
		try {
			semTaxita.acquire(); // el taxita se bloquea hasta que un pasajero
									// lo despierta
		} catch (InterruptedException e) {
			Logger.getLogger(Taxi.class.getName()).log(null);

		}
	}

	public void terminarViaje() {
		semSalida.release(); // el taxi llego a destino
	}

	public void salir() {
		semTaxi.release(); // el pasajero libera el taxi
	}

}