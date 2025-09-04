package Application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
	
	public static int[] meuArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int tam = sc.nextInt();
		
		meuArray = criaVetor(tam);
		meuArray = addNum();
		
		System.out.println("Somatório: " + somatorio());
		System.out.println("Média do vetor: " + media());
		System.out.println("Digite a posição do vetor desejado: ");
		int pos = sc.nextInt();
		System.out.println("Elemento desejado: " + obtemElementoVetor(pos));
		System.out.println("Adicione um numero ao vetor: ");
		int ins = sc.nextInt();
		System.out.println("Valor inserido: " + insereElementoVetor(ins));
		substituirImpares();
		System.out.println("Maior numero do vetor: " + maiorElementoVetor());
		System.out.println("Maior numero do vetor: " + menorElementoVetor());
		System.out.println("Vetor Final: " + Arrays.toString(imprime()));
		
		
		sc.close();
	}
	
	public static int[] criaVetor(int tam) {
		return new int[tam];
	}
	
	public static int[] addNum() {
		Random random = new Random();
		for(int i = 0; i<meuArray.length; i++) {
			meuArray[i] = random.nextInt(10);
		}
		return meuArray;
		
	}
	
	public static int somatorio() {
		int soma = 0;
		for(int i = 0; i<meuArray.length; i++) {
			soma += meuArray[i];
		}
		return soma;
	}
	
	public static double media() {
		int soma = 0;
		double media = 0;
		for(int i = 0;i<meuArray.length;i++) {
			soma+=i;
		}
		media = soma/meuArray.length;
		return media;
	}
	
	public static int obtemElementoVetor(int num) {
		return meuArray[num];
	}
	
	public static int insereElementoVetor(int num) {
		return meuArray[0] = num;
	}
	
	public static void substituirImpares() {
		for(int i = 0; i<meuArray.length; i++) {
			if(meuArray[i]%2==1) {
				meuArray[i] = 0;
			}
			System.out.println("Vetor sem os números impares: " + Arrays.toString(meuArray));
		}
	}
	
	public static int maiorElementoVetor() {
		int maior = 0;
		for(int i = 0; i<meuArray.length;i++) {
			if(meuArray[i]>maior) {
				maior = meuArray[i];
			}
		}
		return maior;
	}
	
	public static int menorElementoVetor() {
		int maior = 100000000;
		for(int i = 0; i<meuArray.length;i++) {
			if(meuArray[i]<maior) {
				maior = meuArray[i];
			}
		}
		return maior;
	}
	
	public static int[] imprime() {
		return meuArray;
	}

}
