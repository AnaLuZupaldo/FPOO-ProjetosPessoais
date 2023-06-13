package pacote;

public class Notas2 {

	int nota1 = 3;
	int nota2 = 2;
	int nota3 = 1;
	int nota4 = 2;
	int media;
	
	public void CalculoMedia() {

		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media > 7) {
			 System.out.println(" Aluno aprovado");
				System.out.println(" Sua média foi " + media);
			
		}else if(media >= 5 && media <= 7) {
			System.out.println(" Aluno de recuperação ");
			System.out.println(" Sua média foi " + media);
		}else if(media < 5){
			System.out.println(" Aluno reprovado");
			System.out.println(" Sua média foi " + media);
		}
		
		
	}
	
	
	
}
