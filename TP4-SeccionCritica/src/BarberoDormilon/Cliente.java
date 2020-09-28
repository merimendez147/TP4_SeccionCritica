package BarberoDormilon;

public class Cliente implements Runnable{
	String nombre;
	Barberia laBarberia;
	
	public Cliente (String n, Barberia b){
		this.nombre=n;
		this.laBarberia=b;
	}
	
	public void run(){
		if (laBarberia.entrar(nombre)){
			laBarberia.solicitarCorte(nombre);
			laBarberia.salir();
		}
	}

}
