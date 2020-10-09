package Punto12;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Hamaca {

	private Lock hamaca;
	public Hamaca(){
		hamaca = new ReentrantLock();
	}
	
	public void descanzar(){
		hamaca.lock();
		System.out.println("El " + Thread.currentThread().getName() + " esta descanzando");
		int tiempo = (int) (Math.random() * 3) + 4;
		try {
			Thread.sleep(tiempo * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dejarHamaca(){
		hamaca.unlock();
		System.out.println("El " + Thread.currentThread().getName() + " dejo de ejercitarse");
	}
}
