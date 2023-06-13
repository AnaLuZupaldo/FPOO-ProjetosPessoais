package pacote;
import java.util.Scanner;

public class Menu {

	int Profissoes;
	double Salario;
	double Total;
	double porcentagem;
	
	Scanner objScanner = new Scanner(System.in);
	
	public void Contador() {
		
		System.out.println(" 1 - Escrituario");
		System.out.println(" 2 - Secretario ");
		System.out.println(" 3 - Caixa");
		System.out.println(" 4 - Gerente ");
		System.out.println(" 5 - Diretor");
		
		System.out.println(" ESCOLHA SUA PROFISSÃO");
		Profissoes = objScanner.nextInt();
		
		System.out.println(" DIGITE SEU SALÁRIO");
		Salario = objScanner.nextDouble();
		
		
		switch (Profissoes) {
		case 1:
			
			
			break;

		default:
			break;
		}
		
		
		

	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
