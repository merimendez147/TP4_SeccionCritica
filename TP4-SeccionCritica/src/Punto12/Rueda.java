package Punto12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Rueda {

	private Lock rueda;
	public Rueda(){
		rueda = new ReentrantLock();
	}
	
	public void ejercitarse(){
		rueda.lock();
		System.out.println("El " + Thread.currentThread().getName() + " esta ejercitandose");
		int tiempo = (int) (Math.random() * 3) + 4;
		try {
			Thread.sleep(tiempo * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dejarRueda(){
		rueda.unlock();
		System.out.println("El " + Thread.currentThread().getName() + " dejo de ejercitarse");
	}
}
	