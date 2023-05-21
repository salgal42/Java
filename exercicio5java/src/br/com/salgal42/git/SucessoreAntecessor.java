/**
 * 
 */
package br.com.salgal42.git;
import java.util.Scanner;
/**
 * @author Salatiel Galvão Zambelino
 * Leia um número inteiro e imprima seu sucessor e antecessor
 */
public class SucessoreAntecessor {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, sucessor, antecessor;
		
		System.out.printf("Digite um número: ");
		
		a = sc.nextInt();
		
		sucessor = a + 1;
		
		antecessor = a - 1;
		
		System.out.println("O número sucessor de " + a + " é "
		+ sucessor);
		
		System.out.println("O número antecessor de " + a + " é "
		+ antecessor);
		
		sc.close();

	}

}
