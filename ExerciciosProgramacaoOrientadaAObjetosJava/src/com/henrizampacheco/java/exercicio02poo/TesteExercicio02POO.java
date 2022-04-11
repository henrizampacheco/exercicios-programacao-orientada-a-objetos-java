package com.henrizampacheco.java.exercicio02poo;

import java.util.Scanner;

/**
 * 2. Considere um vetor de 10 números inteiros positivos maiores que zero e um
 * único número X inteiro, também positivo e maior que zero. Faça um programa
 * para:
 *
 * (a) ler pelo teclado os valores do vetor; (b) ler pelo teclado o número X;
 * (c) verificar se o vetor está em ordem crescente, decrescente ou não
 * ordenado; (d) dizer quantos números no vetor são maiores que X, menores que X
 * e iguais a X
 */
public class TesteExercicio02POO {

    public static void main(String[] args) {
        int[] maioresQueZero = new int[10];
        int num1, num2, contCresc = 0, contDecresc = 0;
        int numX, contMaioresQueX = 0, contMenoresQueX = 0, contIguaisAX = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("(a) ler pelo teclado os valores do vetor:");
        System.out.println("");
        for(int i = 0; i < maioresQueZero.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º. valor do vetor: ");
            maioresQueZero[i] = scan.nextInt();
        }

        System.out.println("");
        System.out.println("(b) ler pelo teclado o número X:");
        System.out.println("");
        System.out.print("Digite o valor do número X: ");
        numX = scan.nextInt();

        System.out.println("");
        System.out.println("(c) verificar se o vetor está em ordem crescente,"
                + " decrescente ou não ordenado:");
        System.out.println("");
        for(int j = 0; j < maioresQueZero.length-1; j++) {
            num1 = maioresQueZero[j];
            num2 = maioresQueZero[j+1];
            if (num1 < num2) {
                contCresc++;
            } else {
                contDecresc++;
            }
        }
        
        for(int k = 0; k < maioresQueZero.length; k++) {
            if (maioresQueZero[k] > numX) {
                contMaioresQueX++;
            } else if (maioresQueZero[k] < numX) {
                contMenoresQueX++;
            } else {
                contIguaisAX++;
            }
        }
        
        if (contDecresc == 0) {
            System.out.println("O vetor está em ordem crescente!");
        } else if (contCresc == 0) {
            System.out.println("O vetor está em ordem decrescente!");
        } else {
            System.out.println("O vetor não está ordenado!");
        }

        System.out.println("");
        System.out.println("(d) dizer quantos números no vetor são maiores que X,"
                + " menores que X e iguais a X:");
        System.out.println("");
        System.out.println("Maiores que X: " + contMaioresQueX);
        System.out.println("Menores que X: " + contMenoresQueX);
        System.out.println("Iguais a X: " + contIguaisAX);
        System.out.println("");
    }
}
