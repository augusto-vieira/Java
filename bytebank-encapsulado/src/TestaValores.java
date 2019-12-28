
public class TestaValores {
	public static void main(String[] args) { 
       // Conta conta = new Conta();
       //conta.setAgencia(-50);
       // conta.setNumero(-330);
		
		// Utilizando Construtor
		
		 Conta conta = new Conta(1337, 24226);   //Obrigado a passar os parametros na hora da Construção
		 System.out.println(conta.getAgencia());
		 conta.setAgencia(1232123);
		 
		 Conta conta2 = new Conta(1337, 16549);    //novas contas
		 Conta conta3 = new Conta(1337, 15660);
		 
		 System.out.println(Conta.getTotal());
    }
}
