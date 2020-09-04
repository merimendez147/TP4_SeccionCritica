package Punto3;


public class Administrativo extends Empleado {
	//atributos de la clase
	int categoria;
	double adicional;
	
	// constructor de la clase
	public Administrativo(String n, String ndni, String d, char s, int l, int a, int c) {
		super(n, ndni, d,s, l, a);
		this.categoria=c;
		this.adicional =calAdicional(c);
	}


	
	//metodos de la clase
	public double adicional(){
		return this.adicional;
	}
	
	public int categoria(){
		return this.categoria;
	}
	
	public void datos(){
		super.datos();
		System.out.print(" Categoria: "+ this.categoria);
	}
	
	private double calAdicional(int cat){
		if (cat ==1){ return 0.25;};
		return 0;
	}
}
