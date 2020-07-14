package model;


public abstract class Funcionario {
	protected int    numRegistro;
	protected String nome;
	protected String email;
	
	// aqui posso ter métodos get/set e constutor
	
	public Funcionario(int numRegistro, String nome, String email) {
		this.numRegistro = numRegistro;
		this.nome        = nome;
		this.email       = email;
	}
	
	/* Este é o termo de compromisso: quando declarado um método abstrado na classe abstrata,
	 * todos os filhos desta classe são OBRIGADOS a implementar a lógica deste método
	 */
	public abstract double calcularSalario();
	

}
