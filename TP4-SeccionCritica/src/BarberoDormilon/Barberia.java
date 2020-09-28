package BarberoDormilon;

import java.util.concurrent.Semaphore;

public class Barberia {
	static Semaphore semBarbero = new Semaphore(0);
	static Semaphore semSillon = new Semaphore(1);
	static Semaphore semSalida = new Semaphore(0);
	
	public static class Barbero extends Thread{
		public void run(){
			System.out.println("El Barbero esta descanzando");
			try {
				semBarbero.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("El Barbero atiende al Cliente");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			semSalida.release();
			System.out.println("El Barbero termino de atender al Cliente");
			} 
		}
	
	
	public static class Cliente extends Thread{
		public void run(){
			if (semSillon.tryAcquire()){
				System.out.println("El sillon esta disponible");
				semBarbero.release();
				System.out.println("Cliente solicita atencion del Barbero");
				try {
					semSalida.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				semSillon.release();
			}
		}
	}
	
	public static void main(String[] args){
		Barbero barbero = new Barbero();
		Cliente cliente = new Cliente();
		Thread b= new Thread(barbero);
		Thread c= new Thread(cliente);
		b.start();
		c.start();

	}
}

