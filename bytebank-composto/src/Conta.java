public class Conta{
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;						//String titular --> Cliente
	
	public void deposita(double valor) {	//há uma diferença de cores entre saldo e valor,
											//pois o primeiro é um atributo do objeto Conta, enquanto o segundo é uma variável.
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
            destino.deposita(valor);		// reaproveitando outro método
            return true;
        } else {
            return false;
        }
    }
	
	public double getSaldo() { 
        return this.saldo;
    }
	
}