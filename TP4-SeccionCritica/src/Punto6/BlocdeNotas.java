
package Punto6;

import java.util.concurrent.Semaphore;

public class BlocdeNotas {
	private int contador = 0; // cuenta la cantidad de letras que imprime cada
								// hilo
	private Semaphore[] turno = new Semaphore[3];
	private Semaphore mutexContador = new Semaphore(1); // protege la variable
														// contador

	public BlocdeNotas() {
		turno[0] = new Semaphore(1, true);
		turno[1] = new Semaphore(0, true);
		turno[2] = new Semaphore(0, true);
	}

	private void asignarTurno(int i) {
		if (i < turno.length) {
			turno[i].release();
		} else {
			turno[0].release();
		}
	}

	private void esperarTurno(int i) {
		try {
			turno[i].acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void inicializaContador() {
		try {
			mutexContador.acquire();
			contador = 0;
			mutexContador.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void incrementaContador() {
		try {
			mutexContador.acquire();
			contador++;
			mutexContador.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean imprimeUltimaVez(int i) {
		return contador == i;
	}

	public void escribir(char l, int i) {
		esperarTurno(i);
		if (imprimeUltimaVez(i)) {
			System.out.println(l);
			inicializaContador();
			asignarTurno(i + 1);
		} else {
			System.out.println(l);
			turno[i].release();
			incrementaContador();

		}
	}
}
