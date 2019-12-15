
public class TesteCondicional {
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 10;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais que 18 anos.");
			System.out.println("Seja bem vindo");
			
		} else {
			if (quantidadePessoas >=2) {
				System.out.println("Você não tem 18, mas pode entrar, está acompanhado.");
			}
			  else {
			System.out.println("Infelizmente você não pode entrar.");
			}
		}
		//alterado pelo github
		//alterado pelo Eclipse
		
	}
}
