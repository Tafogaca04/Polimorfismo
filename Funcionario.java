package Polimorfismo;

public class Funcionario {
	private String nome;
	private int id;
	private String telefone;
	private String endereco;
	private int matricula;
	

	public Funcionario (String nome,int id,String telefone,String endereco,int matricula) {
		this.nome= nome;
		this.id= id;
		this.telefone= telefone;
		this.endereco= endereco;
		this.matricula= matricula;

		
	}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome=nome;
	}
		public int getId() {
			return id;
		}
		public void setId(int id){
			this.id=id;
		
	}
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula){
			this.matricula=matricula;
}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone){
			this.telefone=telefone;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco){
			this.endereco=endereco;
		}
		public double calcularSalario(double salarioBruto, double desconto) {
			return salarioBruto - desconto;
		}
}