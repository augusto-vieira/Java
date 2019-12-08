
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		// quanto vale o segundo?
		// ele não guarda a referência
		
		System.out.println(segundo);
	}
}
