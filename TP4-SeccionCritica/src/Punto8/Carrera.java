package Punto8;

public class Carrera {
	
	public static void main(String [] args){
		Testigo unTestigo = new Testigo();
		Atleta a1 = new Atleta("Nº1",unTestigo,0);
		Atleta a2 = new Atleta("Nº2",unTestigo,1);
		Atleta a3 = new Atleta("Nº3",unTestigo,2);
		Atleta a4 = new Atleta("Nº4",unTestigo,3);
		Thread h1= new Thread(a1);
		Thread h2= new Thread(a2);
		Thread h3= new Thread(a3);
		Thread h4= new Thread(a4);
		h1.start();
		h2.start();
		h3.start();
		h4.start();
	}
}
