package exercicio4;
import java.util.Scanner;


public class Exercicio4 {
	private static Scanner teclado;

	public static void main(String[] args) {
		System.out.println("Diga o nome, valor e a quantidade do produto a ser comprado: ");
		teclado = new Scanner(System.in);
		String nome = teclado.next();
		float valor = teclado.nextFloat();
		int qtd = teclado.nextInt();
		
		System.out.println("Nome: " + nome); 
		
		if (qtd <= 10) {
			System.out.println("Valor Total: " + valor*qtd);
		}else if (qtd <= 20) {
			System.out.println("Valor Total: " + ((qtd*valor)*0.9) );
		}else if (qtd <= 50) {
			System.out.println("Valor Total: " + ((qtd*valor)*0.8) );
		}else {
			System.out.println("Valor Total: " + ((qtd*valor)*0.75) );
		}
		
	}
}

