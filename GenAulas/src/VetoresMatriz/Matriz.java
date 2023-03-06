package VetoresMatriz;

public class Matriz {

	public static void main(String[] args) {
		int [][] numeros = {{1,2,3,4},{5,6,7},{8,9,10},{11,12,13}};
		numeros [1][2]= 50;
		
		System.out.println(numeros[1][2]);
		//O primeiro valor determina a coluna, o segundo a posição dentro da coluna
	}

}
