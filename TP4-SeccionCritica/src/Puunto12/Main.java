package Puunto12;

public class Main {
	public static void main(String[] args) {
	Tienda tienda = new Tienda();
	for(int i=1; i<=6; i++){
		Hamster hamster = new Hamster("Hamster "+i, tienda);
		Thread h = new Thread(hamster);
		h.start();
	}
	}
}
