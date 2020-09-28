package BarberoDormilon;

import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class Barberia {
	Semaphore semBarbero;
	Semaphore semSillon;
	Semaphore semSalida;
	String miNombre;
	
	public Barberia(String nombre){
		miNombre=nombre;
		semSillon = new Semaphore(1);
		semBarbero = new Semaphore(0);
		semSalida = new Semaphore(0);
	}
	
	
	public boolean entrar(String n){
		return (semSillon.tryAcquire());
	}
	
	
	public void solicitarCorte(String n){
		semBarbero.release();
		try{
			semSalida.acquire();
		}catch(InterruptedException e){
			Logger.getLogger(Barberia.class.getName()).log(null);
		}
	}
	public void esperarCliente(){
		try{
			semBarbero.acquire();
		}catch (InterruptedException e){
			Logger.getLogger(Barberia.class.getName()).log(null);
			
		}
	}
	
	public void terminarAtencion(){
		semSalida.release();
	}
	
	public void salir(){
		semSillon.release();
	}
	
	
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

