
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		// quanto vale o segundo?
		// ele n�o guarda a refer�ncia
		
		System.out.println(segundo);
	}
}
