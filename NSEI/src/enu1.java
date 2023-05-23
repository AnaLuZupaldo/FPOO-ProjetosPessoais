import java.util.Scanner;

public class enu1 {

	String[] Nomes = new String[10];
	Scanner objScanner = new Scanner(System.in);
		
	public void ExibirNomes(){
		for(int indice = 0; indice < Nomes.length; indice++) {
			System.out.println(" DIGITE UM NOME");
			Nomes[indice] = objScanner.next();
		
		}
		
		System.out.println(" ALUNOS ");
		int indice = 0;
		while(indice < Nomes.length) {
			System.out.println((indice+1) + " ALUNOS " + Nomes[indice]); 
			indice++;
		}
		
	}
	
	}
