package Geral;

import java.util.Scanner;

public class TesteString {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String iniciais = "";
		System.out.println("Entre com um nome completo");
		String nome = teclado.nextLine();
		int inicio = 0;
		int fim = nome.indexOf(" ", inicio);
		int lastNameIndex = nome.lastIndexOf(" ");
		System.out.println(lastNameIndex);
		while (inicio <= lastNameIndex) {
			iniciais += nome.substring(inicio,inicio + 1) + ". ";
			inicio = fim + 1;
			fim = nome.indexOf(" ", inicio);
		}
		//String LastName = nome.substring(lastNameIndex, fim
	}
}
