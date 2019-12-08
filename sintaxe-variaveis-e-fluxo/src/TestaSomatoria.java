
public class TestaSomatoria {
	// Somatoria parciais 0+1 = 1 ; 1+2 = 3
	// 3+3 = 6 ; 4+6 = 10 ...
	public static void main(String[] args) {
		int contador = 0;
		int total = 0; 
		while(contador <= 10) {
		
		//	int total = 0;   //deveria estar fora no escopo
		//	total = total + contador;
			total += contador;
			
			System.out.println(total);
			contador++;
		}
		System.out.println("Resposta = " + total);
	}
}
