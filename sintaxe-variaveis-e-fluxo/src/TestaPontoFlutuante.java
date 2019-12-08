
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario = 1250.70;
		System.out.println("Meu salario é " + salario );
		
		double idade = 37;
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;			 // Errado, variavel int 
		System.out.println(outraDivisao); 
		
		double outraDoubleDivisao = 5 / 2;		 // Errado, 5 e 2 = inteiro 
		System.out.println(outraDoubleDivisao);
		
		double novaTentativa = 5.0 / 2;		 // Correta, 5.0 = float 
		System.out.println(novaTentativa);
		
	}
	
}
