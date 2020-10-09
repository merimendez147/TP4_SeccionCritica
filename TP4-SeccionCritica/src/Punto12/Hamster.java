package Punto12;

public class Hamster implements Runnable{
	
	private Plato plato;
	private Rueda rueda;
	private Hamaca hamaca;
	
	public Hamster(Plato p, Rueda r, Hamaca h){
		plato=p;
		rueda=r;
		hamaca=h;
	}
	
	public void run(){
		while(true){
			rueda.ejercitarse();
			rueda.dejarRueda();
			plato.comer();
			plato.dejarPlato();
			hamaca.descanzar();
			hamaca.dejarHamaca();
			
		}
	}

}
