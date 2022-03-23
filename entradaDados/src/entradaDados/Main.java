package entradaDados;

import java.nio.file.FileSystemNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		Scanner sc =  new Scanner(System.in);
		
		String nome;
		Integer idade;
		Double saldo;
		
		System.out.println("Entre com seu nome!");
		nome = sc.next();
		
		System.out.println("Entre com sua idade!");
		idade = sc.nextInt();
		
		System.out.println("Entre com o valor que você tem na conta no momento ex... 230,87");
		saldo = sc.nextDouble();
		
		System.out.println(nome +" Parabens pelos " + idade + " de idade e pelos " + saldo +" na conta");
		
		sc.close();
	}
}
