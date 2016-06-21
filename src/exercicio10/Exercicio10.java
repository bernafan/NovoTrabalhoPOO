package exercicio10;
import java.util.Scanner;


public class Exercicio10 {
	public static Scanner teclado;
	
	public static double retornaSoma(double valor, double taxa) {
		double soma = 0 ;
		for (int i = 1; i <= 12; i++) {
			soma = (soma + valor);
			soma += (taxa/100)*soma;
		}
		return soma;
	}
	
	public static void main(String[] args) {
		System.out.println("Qual o investimento mensal e a taxa de juros(somente números)?");
		teclado = new Scanner(System.in);
		double valor = teclado.nextDouble();
		double taxa = teclado.nextDouble();
		
		double soma =  retornaSoma(valor, taxa);
		
		System.out.println("Saldo de investimento após um ano: " + soma);
		System.out.println("Deseja processar mais um ano? (s/n)");
		String opcao = teclado.next();
		if (opcao.equals("s")) {
			soma = retornaSoma(soma, taxa);
			System.out.println("Saldo de investimento após 2 ano: " + soma);
		}
		
	}
}
