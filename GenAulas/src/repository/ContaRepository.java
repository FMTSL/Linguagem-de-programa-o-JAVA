package repository;

import encapsulamento.ContaBancaria;

public interface ContaRepository {
	
	//CRUD de conta
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void	cadastrar(ContaBancaria conta);
	public void atualizar(ContaBancaria conta);
	public void	deletar (int numero);
	
	//Métodos bancários
	public void sacar (int numero, float valor);
	public void depositar (int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDeDestino, float valor);
}
