public class Conta{
	private double saldo;
	private int  agencia;
	private int numero;
	private Cliente titular;						//String titular --> Cliente
	private static int total;						// static --> atributo da classe
	
	
	 public Conta() {
		 												// Outro construtor
	 }

	 public Conta( int agencia, int numero) { 			// Construtor
		 total++;
		 System.out.println("o total de contas � " + total);
		 
		 this.agencia = agencia;
		 this.numero = numero;
		 System.out.println("estou criando uma conta " + this.numero);
	 }

	
	
	
	
	public void deposita(double valor) {	//h� uma diferen�a de cores entre saldo e valor,
											//pois o primeiro � um atributo do objeto Conta, enquanto o segundo � uma vari�vel.
        this.saldo = this.saldo + valor; 
    }
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
		    this.saldo = this.saldo - valor;
		    return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            destino.deposita(valor);		// reaproveitando outro m�todo
            return true;
        } else {
            return false;
        }
    }
	
	public double getSaldo() { 
        return this.saldo;
    }
	
	public int getNumero() {
		return this.numero;
	}
	
	public void o(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) { 
        this.titular = titular; 

    }

    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal() {	// s� acessa atributos est�ticos
    	return Conta.total;  		// ou "return total"
    }
}