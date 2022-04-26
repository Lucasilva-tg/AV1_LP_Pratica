package PorvaLT;
import java.util.Scanner;
public class Quetão1 {

	public static void main(String[] args) {	

	int aux , j, i, somaTotal = 0, media;
			int[] notas = new int[10];
			Scanner ler = new Scanner(System.in);
			
			
			for (i = 0; i <10; i++) {
				System.out.println("Digite a nota do aluno " + i + ": ");
				int notAluno = ler.nextInt();
				notas[i] = notAluno;
				somaTotal=somaTotal + notas[i];
			}
			
			for (i = 0; i < 10; i++) {
				for (j = 0; j < 9; j++) {
					if (notas[j] > notas[j+1]) {
						aux = notas[j];
						notas [j] = notas[j+1];
						notas[j+1] = aux;
					}
				}
				
			}
			
			media = somaTotal/10;
			System.out.println("A maior nota foi: " + notas[9]);
			System.out.println("A segunda maior nota foi: " + notas[8]);
			System.out.println("A terceira maior nota foi: " + notas[7]);
			System.out.println("A menor nota foi: " + notas[0]);
			System.out.println("A media das notas foi: " + media);

				
			/*
			
			
			for (i = 1; i <= 10; i++) {
				somaTotal = somaTotal + notas[i-1];
				if(notas[i-1] > maior) {
					maior = notas[i-1];
					indiceMaior = i - 1;
				}
				if(notas[i-1] < menor) {
					menor = notas[i-1];
					indiceMenor = i - 1;
				}
			}
			for (i = 1; i <= 10; i++) {
				if(notas[i-1] > seguMaior && notas[i-1] < maior) {
					seguMaior = notas[i-1];
					indiceSegu = i - 1;
				}
			}
			for (i = 1; i <= 10; i++) {
				if(notas[i-1] > terMaior && notas[i-1] < seguMaior) {
					terMaior = notas[i-1];
					indiceTer = i - 1;
				}
			}*/
			

      }
}
