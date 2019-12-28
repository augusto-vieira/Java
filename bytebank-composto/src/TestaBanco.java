
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente(); 
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta(); 
        contaDoPaulo.deposita(100);
        
        // Associa o cliente paulo a conta contaDoPaulo
        contaDoPaulo.titular = paulo; 			     	//titular recebe o cliente
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);    	// endereço que o objeto está apontando
        System.out.println(paulo);						// (contaDoPaulo.titular = paulo)  tem o mesmo endereço 
	}

}
