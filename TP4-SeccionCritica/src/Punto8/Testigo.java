package Punto8;

import java.util.concurrent.Semaphore;

public class Testigo {

	private Semaphore[] testigo = new Semaphore[4];

	public Testigo() {
		testigo[0] = new Semaphore(1, true);
		testigo[1] = new Semaphore(0, true);
		testigo[2] = new Semaphore(0, true);
		testigo[3] = new Semaphore(0, true);
	}

	public void pasarTestigo(int i) {
		if (i < testigo.length) {
			testigo[i].release();
		} else {
			System.out.println("Termino la carrera");
		}
	}

	public void esperarTestigo(int i) {
		try {
			testigo[i].acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
