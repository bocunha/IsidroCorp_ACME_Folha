package model;

public class Chefe extends Funcionario {
	private double salarioBase;
	private double adicionalFuncao;
	private double beneficioTerno;
	
	public Chefe(int numRegistro, String nome, String email, double sb, double af, double bt) {
		super(numRegistro, nome, email);
		this.salarioBase = sb;
		this.adicionalFuncao = af;
		this.beneficioTerno = bt;
	}
	
	/* escrever a lógica do método abstrato equivale ao cumprimento do termo de compromisso
	 * Note que o método agora não é mais ABSTRACT
	 */
	public double calcularSalario() {
		return salarioBase + (salarioBase * adicionalFuncao/100) + beneficioTerno;
	}
}