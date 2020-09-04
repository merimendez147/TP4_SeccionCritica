package Punto3;



public class Empleado extends Persona {

	//atributos de la clase
	int legajo;
	int antiguedad;
	
	//constructor de clase
	public Empleado(String n, String ndni, String d, char s, int l, int a) {
		super(n, ndni, d, s);
		this.legajo=l;
		this.antiguedad=a;
	}



	//metodos de la clase
	public int legajo(){
		return this.legajo;
	}
	
	public int antiguedad(){
		return this.antiguedad;
	}
	public void datos(){
		super.datos();
		System.out.print(" Legajo: "+ this.legajo +" Antiguedad: "+ this.antiguedad);
	}
}
