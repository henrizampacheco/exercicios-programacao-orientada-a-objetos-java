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
public class ConversaoDeUnidadesDeVolume {
    
    public static void converterCmCubicos(double litro) {
        System.out.println(litro + " L é igual a " + (litro * 1000) + " cm³.");
    }
    
    public static void converterLitros(double metroCubico) {
        System.out.println(metroCubico + " M³ é igual a " + (metroCubico * 1000) + " L.");
    }
    
    public static void converterPesCubicos(double metroCubico) {
        System.out.println(metroCubico + " M³ é igual a " + (metroCubico * 35.32) + " ft³.");
    }
    
    public static void converterPolCubicas(double galaoAmericano) {
        System.out.println(galaoAmericano + " gal é igual a " + (galaoAmericano * 231) + " in³.");
    }
    
    public static void converterGalParaLitros(double galaoAmericano) {
        System.out.println(galaoAmericano + " gal é igual a " + (galaoAmericano * 3.785) + " L.");
    }
}
