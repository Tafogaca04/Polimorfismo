package Polimorfismo;

public class ConsultorPj extends Funcionario {
	public ConsultorPj (String nome,int id,String telefone,String endereco,int matricula) {
		super(nome,id,telefone,endereco,matricula);
}
	@Override
	public double calcularSalario(double valorTotal,double imposto) {
		return valorTotal - imposto;
	}
 

}
