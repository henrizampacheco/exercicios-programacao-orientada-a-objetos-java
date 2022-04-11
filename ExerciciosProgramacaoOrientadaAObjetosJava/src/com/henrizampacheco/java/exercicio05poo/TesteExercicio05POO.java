package com.henrizampacheco.java.exercicio05poo;

/**5. Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para
 * conversão das unidades de volume segundo a lista abaixo. Cada conversão
 * deve ser realizada por um método que recebe como parâmetro um valor para
 * converter.
 * 1 litro = 1000 centímetros cúbicos
 * 1 metro cúbico = 1000 litros
 * 1 metro cúbico = 35.32 pés cúbicos
 * 1 galão americano = 231 polegadas cúbicas
 * 1 galão americano = 3.785 litros
 * Depois crie uma classe Teste para realizar a chamada dos métodos criados.
 */
public class TesteExercicio05POO {
    public static void main(String[] args) {
        double litro, metroCubico, galaoAmericano;
        
        litro = 1;
        metroCubico = 1;
        galaoAmericano = 1;
        
        System.out.println("Conversões de unidades de volume:");
        System.out.println("");
        ConversaoDeUnidadesDeVolume.converterCmCubicos(litro);
        ConversaoDeUnidadesDeVolume.converterLitros(metroCubico);
        ConversaoDeUnidadesDeVolume.converterPesCubicos(metroCubico);
        ConversaoDeUnidadesDeVolume.converterPolCubicas(galaoAmericano);
        ConversaoDeUnidadesDeVolume.converterGalParaLitros(galaoAmericano);
    }
}
