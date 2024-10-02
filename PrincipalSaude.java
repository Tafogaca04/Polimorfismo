package Polimorfismo;

public class PrincipalSaude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Medico med = new Medico("Leonardo", "endocrinologista", 880, "12098");
			med.agendarConsulta();
			System.out.println("    ");
			System.out.println("Nome: "+med.getNome());
			System.out.println("Especialidade: "+med.getEspecialidade());
			System.out.println("Valor: "+med.getValorConsulta());
			System.out.println("Crm: "+med.getCrm());
			
			
			
			
			Dentista dent = new Dentista("Soraya", "ondontopediatria", 350, "12048");
			dent.agendarConsulta(); 
			System.out.println("    ");
			System.out.println("Nome: "+ dent.getNome());
			System.out.println("Especialidade: "+dent.getEspecialidade());
			System.out.println("Valor: "+dent.getValorConsulta());
			System.out.println("Cro: "+dent.getCro());
	    	dent.agendarConsulta(); 


		
			
			Fisioterapeuta fisio = new Fisioterapeuta("Bárbara", "ortopédica", 760, "12078");
			System.out.println("    ");
			System.out.println("Nome: "+fisio.getNome());
			System.out.println("Especialidade: "+fisio.getEspecialidade());
			System.out.println("Valor: "+fisio.getValorConsulta());
			System.out.println("Crefito: "+fisio.getCrefito());
			fisio.agendarConsulta();


			
	}

}
