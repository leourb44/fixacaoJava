import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Office Desk";
		
		Integer idade = 29;
		Integer codigo = 329032;
		char genero = 'F';
		
		Double valor1 = 2100.0;
		Double valor2 = 650.5;
		Double measure = 53.234567;
		
		System.out.println("Produtos");
		System.out.println(produto1 + " por apenas " + valor1);
		System.out.println(produto2 + " por apenas " + valor2);
		
		System.out.println("Nota: " + idade + " anos de idade, Codigo "+ codigo+ " Genero " + genero);
		
		System.out.println("Measue which eight decimal places: " + measure);
		System.out.printf("%.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f", measure);
	}

}
