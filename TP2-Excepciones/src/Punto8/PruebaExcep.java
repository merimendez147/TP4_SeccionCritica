package Punto8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExcep extends Exception{

	public PruebaExcep(){}

	public PruebaExcep(String cadena){
		super(cadena);
	}
	
	public static void leerEdad() throws PruebaExcep{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Ingrese la edad");
			int edad=sc.nextInt();
			if (edad < 18)throw new PruebaExcep("Menor de edad");
			System.out.println("La edad ingresada es mayor a 18");
		}catch (InputMismatchException ex){
			System.out.println("Debe ingresar un numero entero");		
		}
	}
	
	public static void main(String [] args){
		try{
			leerEdad();
		}catch (PruebaExcep ex){
			System.out.println(ex.getMessage());
		}
	}
}

