
public class TestaEscopo {
	public static void main(String[] args) {

		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadesPessoas = 3;
		
		//boolean acompanhado =  quantidadesPessoas >= 2;
		
		boolean acompanhado; // Aqui ela � global, todos podem v� 
							 // boolean precisa ser inicializada 
							 // com algum valor "false" ou "true" 
							 
		if(quantidadesPessoas >= 2) {
			acompanhado = true;
		   
		} else {
			 acompanhado = false;
		}
		
/*============================================================	
		if(quantidadesPessoas >= 2) {
			boolean acompanhado = true;
		    // Quando vc declara uma vari�vel
		    //  ela s� vale dentro do bloco que 
		    //  ela nasceu 
			
		} else {
			boolean acompanhado = false;
			// Por isso tivemos que declarar aqui novamente ("boolean acompanhado")
		}
============================================================*/
	
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");

		} else {
			System.out.println("Infelizmente voc� n�o pode entrar.");
		}
	}
}
