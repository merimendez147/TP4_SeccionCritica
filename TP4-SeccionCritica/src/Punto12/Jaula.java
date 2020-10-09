package Punto12;



public class Jaula {
	public static void main(String[] args) {
		Hamaca hamaca = new Hamaca();
		Rueda rueda = new Rueda();
		Plato plato = new Plato();
		for(int i=1; i<=6; i++){
			Hamster hamster = new Hamster(plato, rueda, hamaca);
			Thread h = new Thread(hamster);
			h.setName("Hamster "+i);
			h.start();
		}
		}
}
