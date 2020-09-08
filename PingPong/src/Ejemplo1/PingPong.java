package Ejemplo1;

public class PingPong extends Thread{
private String cadena; // Lo que va a escribir.
private int delay; // Tiempo entre escritura

public PingPong(String cartel,int cantMs){
cadena = cartel;
delay = cantMs;
};

public void run(){
for (int i = 1; i< delay * 10; i++){
System.out.print(cadena + " ");
try {
Thread.sleep(delay);
} catch(InterruptedException e) {
	System.out.println(e.getMessage());
}
}
} //fin método run()

public static void main(String[] args){
PingPong t1 =new PingPong("PING",33);
PingPong t2= new PingPong("PONG",10);
// Activación
t1.start();
t2.start();
// Espera unos segundos
try{
Thread.sleep(5000);
}catch (InterruptedException e){
	System.out.println(e.getMessage());};
// Finaliza la ejecución de los threads
}
} //fin clase PingPong
