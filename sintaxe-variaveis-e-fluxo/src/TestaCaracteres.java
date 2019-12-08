
public class TestaCaracteres {
	
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);   
									//Tabela unicode
		char valor = 65;
		System.out.println(valor);
		
	/*	valor = valor +1;	  		//não copila
		System.out.println(valor);
	*/
		
		valor = (char) (valor + 1); //Copila !!!
								//Transforma o resultado da soma em char
		
		String palavra = "Alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		
	}
	
}
