package model;


public abstract class Funcionario {
	protected int    numRegistro;
	protected String nome;
	protected String email;
	
	// aqui posso ter m�todos get/set e constutor
	
	public Funcionario(int numRegistro, String nome, String email) {
		this.numRegistro = numRegistro;
		this.nome        = nome;
		this.email       = email;
	}
	
	/* Este � o termo de compromisso: quando declarado um m�todo abstrado na classe abstrata,
	 * todos os filhos desta classe s�o OBRIGADOS a implementar a l�gica deste m�todo
	 */
	public abstract double calcularSalario();
	

}
