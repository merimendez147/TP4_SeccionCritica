package Punto6;

import java.util.concurrent.Semaphore;

public class BlocdeNotas {
	private int contador = 0; //cuenta la cantidad de letras que se imprimen
	Semaphore [] turno = new Semaphore[3];
	
	public BlocdeNotas(){
	turno [0]= new Semaphore(1);
	turno[1]= new Semaphore(0);
	turno[2]= new Semaphore(0);
	
	}

	/*static void asignarTurno (int i){
		try {
		turno[i].release();
		}catch (ArrayIndexOutOfBoundsException ex){
			turno[0].release();
	}}*/

	public void escribir(char l, int i){
		if (turno[i].tryAcquire()) {
			if (contador == i){
				System.out.println(l);
				contador=0;
				try { //asignarTurno(i+1);
					turno[i+1].release();
					}catch (ArrayIndexOutOfBoundsException ex){
						turno[0].release();}
			}else {
					System.out.println(l);
					turno[i].release();
					contador=contador +1;
			}}
	}
	
}


