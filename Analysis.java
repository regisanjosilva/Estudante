import java.util.Scanner;
	public class Analysis{
	
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	
	int aprovado = 0;
	int reprovado = 0;
	int numeroDeEstudante = 1;
	
	while(numeroDeEstudante <=10){
		System.out.println("entre com resultado ( 1 = aprovado, 2 = reprovado): ");
        int	resultado = input.nextInt();

			if (resultado == 1)
				aprovado = aprovado + 1;
				
			else
				
				reprovado = reprovado + 1;
			
			numeroDeEstudante = numeroDeEstudante + 1;
			
				
	}
			System.out.printf("Aprovado:, %d%nReprovado: %d%n  ", aprovado, reprovado);
			
			if(aprovado > 8 )
				System.out.println("Bonus do professor");
				
			
	
	
	
	
	}
	
	
	}