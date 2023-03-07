package encapsulamento;

public class TesteConta {

	public static void main(String[] args) {
		
//		ContaBancaria conta1 = new ContaBancaria();
//		conta1.setNumero(032);
//		conta1.setAgencia(22);
//		conta1.setTipo("Corrente");
//		conta1.setTitular("Felipe Matos");
//		conta1.setSaldo(20000);
//		
//		System.out.println(conta1.getNumero());
//		System.out.println(conta1.getAgencia());
//		System.out.println(conta1.getTipo());
//		System.out.println(conta1.getTitular());
//		System.out.println(conta1.getSaldo());
		
		ContaCorrente contaCorrente1 = new ContaCorrente(32, 33, "Conta Corrente", "Felipe",100.0f,3000.0f);
		
		System.out.println("Saldo inicial " + contaCorrente1.getSaldo());
		contaCorrente1.sacar(50);
		System.out.println("Saldo por saque " + contaCorrente1.getSaldo());
	}
}
