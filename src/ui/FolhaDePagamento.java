package ui;

import model.Chefe;
import model.Funcionario;

public class FolhaDePagamento {
	public static void main(String args[]) {
		Funcionario f;
		
		f = new Chefe(1,"Isidro","isidro@acme.com", 5000.0, 15.0, 800.0);
		
		
		System.out.println("Salario do cabra: "+f.calcularSalario());
	}

}