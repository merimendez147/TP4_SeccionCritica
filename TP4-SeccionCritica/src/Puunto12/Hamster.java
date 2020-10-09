package Puunto12;

public class Hamster implements Runnable{

	public Tienda tienda;
	public String nombre;
	
	public Hamster(String n, Tienda t){
		tienda=t;
		nombre=n;
	}
	
	
	public void run(){
		while (true){
		tienda.comer(nombre);
		tienda.ejercitarse(nombre);
		tienda.descanzar(nombre);
		}
	}
}
