
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		// conta.numero = 1337;				Atribui��o direta
	//	conta.setNumero(1337);				// Protegido,se um dia precisar alterar,s� mudamos esse m�todo(setNumero).
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente(); 
		paulo.setNome("paulo silveira");

        conta.setTitular(paulo);
		
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador"); 
        //agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

        System.out.println(titularDaConta); 
        System.out.println(paulo);
        System.out.println(conta.getTitular());
	}

}
