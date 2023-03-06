package EstruturaDeDados;

public class Pilha {
	private int tamanhoMaximo;
	private int[] pilha;
	private int topo;
	
	public Pilha(int s) {
		tamanhoMaximo= s;
		pilha = new int[s];
		topo = -1;
	}

	public void push(int item) {
		if (topo == tamanhoMaximo -1) {
			System.out.println("A pilha está cheia, não posso adcionar mais nada");
		} 
		else {
			topo++;
			pilha[topo] = item;
		}
	}
	
	public void pop () {
		if (topo == -1) {
			System.out.println("A pilha está vazia, nem tem mais o que tirar daqui ");
		}
		else {
			System.out.println("Elemento retirado");
			topo --;
		}
	}
	
	public int peek() {
		return pilha[topo];
	}
}
