package ModuloDezComportamentoMemoriaArraysListaVetoresProblemaMediaPares;

import java.util.Locale;
import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int vect[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double media = 0.0;
		int quantidade = 0;
		double notaPares = 0.0;
		
		
		for (int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0.0) {
				quantidade++;
				notaPares += vect[i];
			}
		}
		
		if (notaPares == 0.0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			media = notaPares / quantidade;
			System.out.printf("MEDIA DOS PARES = %.1f ", media);
		}
		
		sc.close();

	}

}
