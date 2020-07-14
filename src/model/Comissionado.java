package model;

public class Comissionado extends Funcionario {
	private double salarioBase;
	private double comissao;
	
	public Comissionado(int numRegistro, String nome, String email, double sb, double cm) {
		super(numRegistro, nome, email);
		this.salarioBase = sb;
		this.comissao = cm;
	}
	
	/* escrever a l�gica do m�todo abstrato equivale ao cumprimento do termo de compromisso
	 * Note que o m�todo agora n�o � mais ABSTRACT
	 */
	public double calcularSalario() {
		return salarioBase + (salarioBase * (this.comissao/100));
	}
}