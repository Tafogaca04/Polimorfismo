package Polimorfismo;

public class PrincipalAnimal {
public static void  main (String []args) {
	Lobo lobo = new Lobo ("Thor","M","Qualquer");
	System.out.println("Nome: "+lobo.getNome());
	System.out.println("Sexo: "+lobo.getSexo());
	System.out.println("Raça: "+lobo.getRaca());
    lobo.emitirSom();
	System.out.println("...............................");

	Leao leao = new Leao("Max","M","Qualquer");
	System.out.println("Nome: "+leao.getNome());
	System.out.println("Sexo: "+leao.getSexo());
	System.out.println("Raça: "+leao.getRaca());
	leao.emitirSom();
	System.out.println("...............................");

	
	Tigre tigre = new Tigre ("Luna","F","Qualquer");
	System.out.println("Nome: "+tigre.getNome());
	System.out.println("Sexo: "+tigre.getSexo());
	System.out.println("Raça: "+tigre.getRaca());
	tigre.emitirSom();
	System.out.println("...............................");

	
	Cachorro cachorro = new Cachorro ("Amora","F","shih tzu");
	System.out.println("Nome: "+cachorro.getNome());
	System.out.println("Sexo: "+cachorro.getSexo());
	System.out.println("Raça: "+cachorro.getRaca());
	cachorro.emitirSom();
	System.out.println("...............................");

	
	Gato gato = new Gato ("Mingau","M","Qualquer");
	System.out.println("Nome: "+gato.getNome());
	System.out.println("Sexo: "+gato.getSexo());
	System.out.println("Raça: "+gato.getRaca());
	gato.emitirSom();
}




}

