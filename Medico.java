package Polimorfismo;

public class Medico extends ProfissionalSaude{

	String crm;

	public Medico (String nome, String especialidade, int valorConsulta,String crm) {
		super(nome,especialidade,valorConsulta);
		this.crm = crm;
	}
	@Override
	public void agendarConsulta() {
		System.out.print("agendar consulta com um médico");
	}

	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
}
