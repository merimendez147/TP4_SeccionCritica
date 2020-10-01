package Punto8;

public class Atleta implements Runnable{
	Testigo miTestigo;
	int posicion;
	String nombre;
	
	public Atleta(String n, Testigo t, int p){
		miTestigo=t;
		posicion=p;
		nombre=n;
	}
	
	private void correr(){
        int tiempo=(int)(Math.random()*11 + 9);
		System.out.println("El atleta "+ nombre +" esta corriendo");
		try {
			Thread.sleep(1000*tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run(){
		miTestigo.esperarTestigo(posicion);
		this.correr();
		miTestigo.pasarTestigo(posicion +1);
	}
}
