package Punto6;

public class Letra implements Runnable {

	char letra;
	int id;
	BlocdeNotas unBloc;

	public Letra(char l, int id, BlocdeNotas b) {
		this.letra = l;
		this.id = id;
		this.unBloc = b;
	}

	public void run() {
		while (true) {
			unBloc.escribir(letra, id);
		}
	}
}
