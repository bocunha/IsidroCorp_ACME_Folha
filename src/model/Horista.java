package model;

public class Horista extends Funcionario {
	private double valorHora;
	private int numHoras;
	
	public Horista(int numRegistro, String nome, String email, double valorHora, int numHoras) {
		super(numRegistro, nome, email);
		this.valorHora = valorHora;
		this.numHoras = numHoras;
	}
	
	/* escrever a lógica do método abstrato equivale ao cumprimento do termo de compromisso
	 * Note que o método agora não é mais ABSTRACT
	 */
	public double calcularSalario() {
		return valorHora * this.numHoras;
	}
}