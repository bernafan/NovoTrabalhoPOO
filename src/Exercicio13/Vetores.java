package Exercicio13;

import java.util.Scanner;

public class Vetores {
	private static Scanner leitura;
	public static int leia(String mensagem) {
		leitura = new Scanner(System.in);
		System.out.println(mensagem);
		return leitura.nextInt();
	}
	public static void main(String[] args) {
		String romanos = "";
		int digitos = leia("Entre com 3 digitos");
		System.out.println(digitos);
		if (digitos >= 0 && digitos <= 999) {
			while (digitos >= 500) {
				digitos -= 500;
				romanos.concat("D");
			}
			while (digitos >= 100) {
				digitos -= 100;
				romanos.concat("C");
			}
			while (digitos >= 50) {
				digitos -= 50;
				romanos.concat("L");
			}
			while ( digitos >= 10) {
				digitos -= 10;
				romanos.concat("X");
			}
			if (digitos == 9) {
				romanos.concat("IX");
			}else if (digitos > 5 ) {
					romanos.concat("V");
					while (digitos > 5) {
						digitos -= 1;
						romanos.concat("I");
					}
			}else if (digitos == 4) {
						romanos.concat("IV");
					}else {
						while (digitos < 4){
							digitos -= 1;
							romanos.concat("I");
						}
					}
			System.out.println(romanos);
		}else 
				System.out.println("Valor inválido:");
	}	
}
