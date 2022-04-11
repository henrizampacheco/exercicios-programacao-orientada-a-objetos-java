package com.henrizampacheco.java.exercicio04poo;

import java.util.Scanner;

/**4. Verifique se as componentes de um vetor de 10 componentes lidos pelo
 * teclado formam uma progressão aritmética, informando se sim ou se não.
 */
public class TesteExercicio04POO {
    public static void main(String[] args) {
        int[] componentes = new int[10];
        Scanner scan = new Scanner(System.in);
        int razao, termo, antecessor, contPA=0;
        int[] vetorDePA = new int[10];
        
        System.out.println("Progressão Aritmética");
        System.out.println("");        
        for(int i=0; i<componentes.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            componentes[i] = scan.nextInt();
        }
        
        // Razão da P.A. = Termo - Antecessor
        termo = componentes[1];
        antecessor = componentes[0];
        razao = componentes[1] - componentes[0];
        
        for(int j=0; j<vetorDePA.length; j++) {
            vetorDePA[j] = antecessor + (razao * j);
            if(componentes[j] == vetorDePA[j]) {
                contPA++;
            }
        }
        
        System.out.println("");
        if(contPA == componentes.length) {
            System.out.println("Sim, os componentes formam uma P.A.");
            System.out.println("Razão = " + razao);
            if(razao > 0) {
                System.out.println("Classificação = Crescente");
            } else if (razao == 0) {
                System.out.println("Classificação = Constante");
            } else {
                System.out.println("Classificação = Decrescente"); // Razão menor que zero
            }
        } else {
            System.out.println("Não, os componentes não formam uma P.A.");
        }
    }
}
