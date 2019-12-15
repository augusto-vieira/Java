
public class CriarConta {
	public static void main(String[] args) {
		 Conta primeiraConta = new Conta();				//Variável do tipo Conta
         primeiraConta.saldo = 200; 					
         System.out.println(primeiraConta.saldo); 
         
         primeiraConta.saldo += 200;
         System.out.println(primeiraConta.saldo);
         
         Conta segundaConta = new Conta();
         segundaConta.saldo = 50;
         
         System.out.println("Primeira conta tem " + primeiraConta.saldo);
         System.out.println("Segunda conta tem " + segundaConta.saldo);
	}
}
