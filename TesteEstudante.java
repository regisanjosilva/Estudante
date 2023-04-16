import java.util.Scanner;

public class TesteEstudante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Estudante aluno1 = new Estudante("regis", 78 );
		Estudante aluno2 = new Estudante("elis", 67);
		
		System.out.printf("%s letraGrau é :  %s%n", 
				aluno1.getNome(), aluno1.getLetraGrau());
		System.out.printf("%s letraGrau é : %s%n",  
				aluno2.getNome(), aluno2.getLetraGrau());
	}
}