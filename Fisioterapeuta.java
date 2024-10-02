package Polimorfismo;

public class Fisioterapeuta  extends ProfissionalSaude{
String crefito;

	public Fisioterapeuta (String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome,especialidade,valorConsulta);
		this.crefito=crefito;
	}
	@Override
	public void agendarConsulta() {
		System.out.print("agendar consulta com um fisioterapeuta");
	}
	public String getCrefito() {
	return crefito;
}
public void setCrefito(String crefito) {
	this.crefito = crefito;
}

}


