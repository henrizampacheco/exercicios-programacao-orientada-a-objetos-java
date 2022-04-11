package com.henrizampacheco.java.exercicio06poo;

/**6. O volume de uma piscina olímpica é de 1.890 metros cúbicos. Usando a
 * classe ConversaoDeUnidadesDeVolume (exercício 5), escreva um programa em
 * Java que mostre qual é o volume de uma piscina olímpica em litros, pés
 * cúbicos e centímetros cúbicos. Escreva métodos adicionais para a classe
 * ConversaoDeUnidadesDeVolume, se necessário.
 */
public class ConversaoUnidadesDeVolume {
    
    // 1 litro = 1000 centímetros cúbicos
    public static void converterCmCubicos(double litro) {
        System.out.println(litro + " L é igual a " + (litro * 1000) + " cm³.");
    }
    
    // 1 metro cúbico = 1000 litros
    public static void converterLitros(double metroCubico) {
        System.out.println(metroCubico + " M³ é igual a " + (metroCubico * 1000) + " L.");
    }
    
    // 1 metro cúbico = 35.32 pés cúbicos
    public static void converterPesCubicos(double metroCubico) {
        System.out.println(metroCubico + " M³ é igual a " + (metroCubico * 35.32) + " ft³.");
    }
    
    // 1 galão americano = 231 polegadas cúbicas
    public static void converterPolCubicas(double galaoAmericano) {
        System.out.println(galaoAmericano + " gal é igual a " + (galaoAmericano * 231) + " in³.");
    }
    
    // 1 galão americano = 3.785 litros
    public static void converterGalParaLitros(double galaoAmericano) {
        System.out.println(galaoAmericano + " gal é igual a " + (galaoAmericano * 3.785) + " L.");
    }
    
    // 1 métro cúbico = 35.315 litros (método adicional, inserido no exercício 6)
    public static void converterLParaPesCubicos(double metroCubico) {
        System.out.println(metroCubico + " M³ é igual a " + (metroCubico * 35.315) + " ft³.");
    }
    
    // 1 metro cúbico = 1000000 centímetros cúbicos (método adicional, inserido no exercício 6)
    public static void converterM3ParaCmCubicos(double metroCubico) {
        System.out.println(metroCubico + " M³ é igual a " + (metroCubico * 1000000) + " cm³.");
    }
}

