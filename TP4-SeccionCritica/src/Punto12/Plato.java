package Punto12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Plato {

	private Lock plato;
	public Plato(){
		plato = new ReentrantLock();
	}
	
	public void comer(){
		plato.lock();
		System.out.println("El " + Thread.currentThread().getName() + " esta comiendo");
		int tiempo = (int) (Math.random() * 3) + 4;
		try {
			Thread.sleep(tiempo * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dejarPlato(){
		plato.unlock();
		System.out.println("El " + Thread.currentThread().getName() + " dejo de comer");
	}
}
