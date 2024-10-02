package Polimorfismo;

public class Horista extends Funcionario {
	public Horista (String nome,int id,String telefone,String endereco,int matricula) {
		super(nome,id,telefone,endereco,matricula);
}
	@Override
	public double calcularSalario(double valorHora, double HoraTrabalhada) {
		return valorHora* HoraTrabalhada;
	}
}
