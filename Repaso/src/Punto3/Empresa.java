package Punto3;
public class Empresa {
	
	static void datos(Empleado p){
		p.datos();
	}
	static void imprimirDatos(Empleado [] t){
		for(int i=0; i<t.length; i++){
			if (t[i]!=null){
			datos(t[i]);
			System.out.println();
			}
		}
	}
	
	static boolean antiguedadEmpleado(Empleado p){
		if (p.antiguedad>10){
			return true;
		}else{
			return false;
		}
	}
	
	static Empleado[] antiguedad(Empleado [] t, int a){
		int j=0;
		Empleado [] e = new Empleado [5];
		for(int i=0; i<t.length; i++){
			if (antiguedadEmpleado(t[i])){
				e[j]=t[i];
				j++;
			}
		}
		return e;
	}
	
	public static void main(String[] args) {
		Empleado [] trabajadores= new Empleado[5];
		Empleado [] antiguos = new Empleado [5];
		int i = 0;
		trabajadores[i++] = new Administrativo("Juana Suarez","27.345.621", "Belgrano 2500", 'F',23456, 12,3);
		trabajadores[i++] = new Administrativo("Mabel Peres","17.345.621", "Avenida Argentina 2500", 'F',13456, 20,2);
		trabajadores[i++] = new Tecnico("Carina Lopez","27.121.021", "Rio Limay 200", 'F',23456, 10, "pregrado", 2001);
		trabajadores[i++] = new Administrativo("Luis Enrique","22.000.001", "Barcelons 500", 'M',25555, 3,7);
		trabajadores[i++] = new Tecnico("Paula Chavez","31.121.021", "Alderete 1110", 'F',33456, 10, "grado", 2012);
		System.out.println("Todos los empleados de la Empresa son:");
		imprimirDatos(trabajadores);
		System.out.println("Los empleados de antiguedad mayor a 10 son:");
		antiguos = antiguedad(trabajadores, 10);
		imprimirDatos(antiguos);
		}
}
