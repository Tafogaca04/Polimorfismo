package Polimorfismo;

public class Dentista  extends ProfissionalSaude{

	String cro;
	public Dentista (String nome, String especialidade, int valorConsulta, String cro) {
		super(nome,especialidade,valorConsulta);
		this.cro=cro;
	}
	@Override
	public void agendarConsulta() {
		System.out.print("agendar consulta com um dentista");
	}
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;

}
}
