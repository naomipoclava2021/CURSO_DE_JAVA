package bloque8;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//matriz de 3x3
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i =0; i<3; i++) {//numero de filas
			for(int j=0; j<3; j++){//numero de columnas
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}

	}

}
