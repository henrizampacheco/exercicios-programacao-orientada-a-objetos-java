package com.henrizampacheco.java.exercicio06poo;

/**6. O volume de uma piscina olímpica é de 1.890 metros cúbicos. Usando a
 * classe ConversaoDeUnidadesDeVolume (exercício 5), escreva um programa em
 * Java que mostre qual é o volume de uma piscina olímpica em litros, pés
 * cúbicos e centímetros cúbicos. Escreva métodos adicionais para a classe
 * ConversaoDeUnidadesDeVolume, se necessário.
 */
public class TesteExercicio06POO {
    public static void main(String[] args) {
        double volPiscinaOlimpica = 1890;
    
        System.out.println("Conversões do volume de uma piscina olímpica:");
        System.out.println("");
        ConversaoUnidadesDeVolume.converterLitros(volPiscinaOlimpica);
        ConversaoUnidadesDeVolume.converterLParaPesCubicos(volPiscinaOlimpica);
        ConversaoUnidadesDeVolume.converterM3ParaCmCubicos(volPiscinaOlimpica);
    }
}
