package br.com.erickfreire.advinhemodificacaodonumero;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Programa em Java que adivinha a modifica��o de um n�mero
 * 
 * @author Erick Freire
 * @version 1 - Criado em 10-05-2021 as 13:43
 */

public class AdvinheAModificacaoDoNumero {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		SecureRandom numneroAleatorio = new SecureRandom();

		int numero = 1 + numneroAleatorio.nextInt(1000);
		int adivinha = 0;
		int contador = 0;

		System.out.println("Um n�mero foi sorteado de 1 a 1000, tente adivinhar qual foi:");

		System.out.print("\nDigite um n�mero: \n");
		adivinha = entrada.nextInt();

		while (adivinha != numero) {
			if (adivinha < numero)
				System.out.printf("%nNumero menor do que o n�mero sorteado! %n");
			if (adivinha > numero)
				System.out.printf("%nNumero maior do que o n�mero sorteado! %n");

			System.out.print("\nDigite um novo n�mero: \n");
			adivinha = entrada.nextInt();
			
			++contador;

		}

		System.out.printf("%nAcertou o n�mero sorteado � o: %d%n", numero);
		
		if(contador < 10)
			System.out.println("Voc� sabe do segredo e tem muita sorte!");
		if(contador == 10)
			System.out.println("Ualll Voc� sabe o segredo!");
		if(contador > 10)
			System.out.println("Voc� pode fazer melhor!");

	}

}
