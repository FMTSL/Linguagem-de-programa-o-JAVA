package Java;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 6;
		
		System.out.println(a == 2 && b == 6);
		//Sera uma condição Falsa!
		
		System.out.println(a == 3 && b == 6);
		//Sera uma condição Verdadeira!

		System.out.println(a == 1 || b == 6);
		//Valores absolutos serão verdadeiras pois necessita que uma das condições seja verdadeira
		
		System.out.println(!(a == 3 || b == 6));
		//Sera Falso pois apresenta condição contraria da esperada
		
		System.out.println(!(a == 2 || b == 7));
		//Sera Verdadeiro pois apresenta condição contraria da esperada
		
	}

}
