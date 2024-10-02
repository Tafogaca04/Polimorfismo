package Polimorfismo;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
	
				Funcionario fun = new Funcionario("Joaquim",1,"(11)9987-6542","rua T",13456);
				System.out.println(fun.getNome());
				System.out.print(fun.calcularSalario(10000.00, 1000));
				System.out.print("                                    ");
				
			Horista hor = new Horista ("Jonathan",34868,"(11)99876-4324","rua George Prado",343987);		
			System.out.println(hor.getNome());
			System.out.print(hor.calcularSalario(100, 200));
			System.out.println("    ");

			Jornada jor = new Jornada ("Joel",67784,"(11)99876-4324","rua George Prado",343987);
			System.out.println( jor.getNome());
			System.out.print(jor.calcularSalario(150, 210));
			System.out.println("   ");

			ConsultorPj cons = new ConsultorPj ("Márcia",67784,"(11)99876-4324","rua George Prado",343987);
			System.out.println(cons.getNome());
			System.out.print(cons.calcularSalario(40000.00, 5000));

		
	}

}
}
