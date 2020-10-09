package Puunto12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tienda {

	private Lock rueda;
	private Lock plato;
	private Lock hamaca;

	public Tienda() {
		rueda = new ReentrantLock();
		plato = new ReentrantLock();
		hamaca = new ReentrantLock();
	}

	public void comer(String nombre) {
		plato.lock();
		try {
			System.out.println("El hamster " + nombre + " esta comiendo");
			int tiempo = (int) (Math.random() * 3) + 2;
			Thread.sleep(tiempo * 1000);
			System.out.println("El Hamster " + nombre + " dejo de comer");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			plato.unlock();
		}
	}

	public void ejercitarse(String nombre) {
		rueda.lock();
		try {
			System.out.println("El Hamster " + nombre + " esta ejercitandose");
			int tiempo = (int) (Math.random() * 3) + 4;
			Thread.sleep(tiempo * 1000);
			System.out.println("El Hamster " + nombre + " dejo de ejercitarse");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			rueda.unlock();
		}
	}

	public void descanzar(String nombre) {
		hamaca.lock();
		try {
			System.out.println("El Hamster " + nombre + " esta descanzando");
			int tiempo = (int) (Math.random() * 3) + 3;
			Thread.sleep(tiempo * 1000);
			System.out.println("El Hamster " + nombre + " dejo de descanzar");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			hamaca.unlock();
		}
	}
}
