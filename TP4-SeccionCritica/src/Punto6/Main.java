package Punto6;

public class Main {
	public static void main(String [] args){
		BlocdeNotas unBloc = new BlocdeNotas();
		Letra a = new Letra('A', 0, unBloc);
		Letra b = new Letra('B', 1, unBloc);
		Letra c = new Letra('C', 2, unBloc);
		Thread h1= new Thread(a);
		Thread h2= new Thread(b);
		Thread h3= new Thread(c);
		h1.start();
		h2.start();
		h3.start();
	}
}
