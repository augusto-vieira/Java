
public class CriarConta {
	public static void main(String[] args) {
		 Conta primeiraConta = new Conta();				//Vari�vel do tipo Conta
         primeiraConta.saldo = 200; 					
         System.out.println(primeiraConta.saldo); 
         
         primeiraConta.saldo += 200;
         System.out.println(primeiraConta.saldo);
         
         Conta segundaConta = new Conta();
         segundaConta.saldo = 50;
         
         System.out.println("Primeira conta tem " + primeiraConta.saldo);
         System.out.println("Segunda conta tem " + segundaConta.saldo);
         
         System.out.println("primeira conta tem " + primeiraConta.saldo);
         System.out.println("segunda conta tem " + segundaConta.saldo);

         System.out.println(primeiraConta.agencia);
         System.out.println(primeiraConta.numero);

         System.out.println(segundaConta.agencia);

         segundaConta.agencia = 146;
         System.out.println("agora a segunda conta est� na agencia " + segundaConta.agencia);

         if(primeiraConta == segundaConta) {   // ir� comparar refer�ncias, e n�o objetos.
             System.out.println("mesma conta");
         } else {
             System.out.println("contas diferentes");
         }
         
         System.out.println(primeiraConta);   // refer�ncias(endere�os) diferentes
         System.out.println(segundaConta);
	}
}
