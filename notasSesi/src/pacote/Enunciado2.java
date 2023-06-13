package pacote;

import java.util.Scanner;

public class Enunciado2 {
	
	String Produtos;
	double quantidade;
	double ResultadoFinal;
	
	Scanner objScanner = new Scanner(System.in);
	
	public void Divisor() {
		System.out.println(" Digite o código do seu produto ");
		Produtos = objScanner.next();
		
		System.out.println(" Digite a quantidade dos produtos ");
		quantidade = objScanner.nextDouble();
		
		switch (Produtos) {
		case "A001":
			ResultadoFinal = (quantidade*7.50);
			System.out.println(" O preço total será de "+ ResultadoFinal);
			
			break;
		case "A002":
			ResultadoFinal = (quantidade*9.90);
			System.out.println(" O preço total será de "+ ResultadoFinal);
			
			break;
		case "A003":
			ResultadoFinal = (quantidade*14.00);
			System.out.println(" O preço total será de "+ ResultadoFinal);
			
			break;
		case "A004":
			ResultadoFinal = (quantidade*19.90);
			System.out.println(" O preço total será de "+ ResultadoFinal);
			
			break;

		default:
			System.out.println(" Código inválido");
			break;
		}
		
		
		
		
	}
	 

}
