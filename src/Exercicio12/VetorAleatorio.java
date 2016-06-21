package Exercicio12;

import java.util.Random;

public class VetorAleatorio {
	public int[] vetor = new int[100];              
	

	public void imprimeVetor() {
		for (int i = 0; i < this.vetor.length; i++) {
			System.out.println(this.vetor[i]);
		}
	}
	
	public static void imprimeVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] vet = new int[100];
		Random gerador = new Random();
		int aux = 0;
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = gerador.nextInt();
		}
		System.out.println("Aleatório:");
		imprimeVetor(vet);
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (vet[i] < vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		System.out.println("Ordenado:");
		imprimeVetor(vet);
		
	}
}
