package model;

public class Empreiteiro extends Funcionario {
	private double valorEmpreeita;
	
	public Empreiteiro(int numRegistro, String nome, String email, double valorEmpreeita) {
		super(numRegistro, nome, email);
		this.valorEmpreeita = valorEmpreeita;
	}
	
	/* escrever a lógica do método abstrato equivale ao cumprimento do termo de compromisso
	 * Note que o método agora não é mais ABSTRACT
	 */
	public double calcularSalario() {
		return this.valorEmpreeita;
	}
}