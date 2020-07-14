package model;

public class Horista extends Funcionario {
	private double valorHora;
	private int numHoras;
	
	public Horista(int numRegistro, String nome, String email, double valorHora, int numHoras) {
		super(numRegistro, nome, email);
		this.valorHora = valorHora;
		this.numHoras = numHoras;
	}
	
	/* escrever a l�gica do m�todo abstrato equivale ao cumprimento do termo de compromisso
	 * Note que o m�todo agora n�o � mais ABSTRACT
	 */
	public double calcularSalario() {
		return valorHora * this.numHoras;
	}
}