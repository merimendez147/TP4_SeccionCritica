package Punto3;
public class Persona {
	//atributos de la clase
	String nombre;
	String dni;
	String direccion;
	char sexo;
	
	//constructor de la clase
	public Persona(String n, String ndni, String d, char s){
		this.nombre =n;
		this.dni= ndni;
		this.direccion=d;
		this.sexo=s;
		
	}
	
	//metodos de la clase
	public String nombre(){
		return this.nombre;
	}
	
	public String dni(){
		return this.dni;
	}
	
	public String direccion(){
		return this.direccion;
	}
	
	
	public char sexo(){
		return this.sexo;
	}
	
	public void datos(){
		System.out.print("Nombre: "+ this.nombre +" DNI: "+ this.dni +" Sexo: "+ this.sexo);
	}
}
