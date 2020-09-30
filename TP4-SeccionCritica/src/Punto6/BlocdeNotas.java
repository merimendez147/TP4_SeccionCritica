  
package Punto6;

import java.util.concurrent.Semaphore;

public class BlocdeNotas {
	private int contador = 0; //cuenta la cantidad de letras que imprime cada hilo
	Semaphore [] turno = new Semaphore[3];
	
	public BlocdeNotas(){
	turno[0]= new Semaphore(1, true);
	turno[1]= new Semaphore(0, true);
	turno[2]= new Semaphore(0, true);
	}

	private void asignarTurno (int i){
		try {
		turno[i].release();
		}catch (ArrayIndexOutOfBoundsException ex){
			turno[0].release();
	}}
	
	private void esperarTurno(int i){
		try {
			turno[i].acquire();
			}catch (ArrayIndexOutOfBoundsException ex){
				turno[0].release();} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void escribir(char l, int i){
		esperarTurno(i);
		if (contador == i){
			System.out.println(l);
			contador=0;
			asignarTurno(i+1);
		}else {
				System.out.println(l);
				turno[i].release();
				contador=contador +1;
		}}
	}	


