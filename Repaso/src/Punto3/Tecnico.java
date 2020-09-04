package Punto3;


public class Tecnico extends Empleado{

	//atributos de la clase
	String titulo;
	int añoEgreso;
	double adicional;
	
	// constructor de la clase
	public Tecnico(String n, String ndni, String d, char s, int l, int a, String t, int e) {
		super(n, ndni, d, s, l, a);
		this.titulo=t;
		this.añoEgreso=e;
		this.adicional=calcularAdicional(this.titulo);
		// TODO Auto-generated constructor stub
	}

	//metodos de la clase
	private double calcularAdicional(String t){
		if (t=="pregrado"){
			return 0.15;
		}
		if (t=="grado"){
			return 0.20;
		}
		if (t=="posgrado"){
			return 0.25;
		}
		return 0;
	}
	
	public String titulo(){
		return this.titulo;
	}
	
	public int egreso(){
		return this.añoEgreso;
	}
	
	public void datos(){
		super.datos();
		System.out.print(" Titulo: "+ this.titulo);
	}
	
}
