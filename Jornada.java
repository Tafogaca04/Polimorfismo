package Polimorfismo;

public class Jornada extends Funcionario {
	public Jornada (String nome,int id,String telefone,String endereco,int matricula) {
		super(nome,id,telefone,endereco,matricula);
}
	@Override
	public double calcularSalario(double salarioHora,double horaTrabalhada) {
		return salarioHora*horaTrabalhada ;
	}
}



