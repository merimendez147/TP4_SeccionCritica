package Punto6;

public class punto6 {

	public static double acceso_por_indice (double [] v, int j) throws RuntimeException{
			try{
				return v[j];
			}catch (RuntimeException exc){
				throw new RuntimeException ("El indice " + j + " no existe en el vector");
			}
			}
			// Desde el siguiente cliente “main”:
			public static void main(String [] args){
			double [] v = new double [15];
			acceso_por_indice (v, 16);
			}

}
