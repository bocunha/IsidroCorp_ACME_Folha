package ui;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String args[]) {
		
		Funcionario folha[];
		folha = new Funcionario[4];
		folha[0] = new Chefe(1,"Isidro Chefe","isidro@acme.com", 5000.0, 15.0, 800.0);
		folha[1] = new Comissionado(2,"Isidro Comissionado","isidro@acme.com", 5000.0, 15.0);
		folha[2] = new Horista(3,"Isidro Horista","isidro@acme.com", 100.0, 15);
		folha[3] = new Empreiteiro(4,"Isidro Empreiteiro","isidro@acme.com", 12500.00);

		System.out.printf("|o| Nome do Cabra:      | Salario do Cabra: |o|\n");
		for ( Funcionario f  : folha ) {
//			System.out.println("Nome do Cabra: "+f.getNome()
//								+"\nSalario do cabra: "+f.calcularSalario()
//								+"\n------------------------------------");
			System.out.printf("|o| %-20s| %17.2f |o|\n",f.getNome(),f.calcularSalario());
		}
	}

}