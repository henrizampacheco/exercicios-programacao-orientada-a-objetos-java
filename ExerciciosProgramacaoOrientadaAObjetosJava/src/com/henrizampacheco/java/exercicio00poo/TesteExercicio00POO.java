package com.henrizampacheco.java.exercicio00poo;

/**Crie uma classe Java para funcionários. Ele deve ter o nome do
 * funcionário, o departamento onde trabalha, seu salário (double), a data
 * de entrada no banco (String) e seu RG (String).
 * 
 * Você deve criar alguns métodos de acordo com sua necessidade. Além
 * deles, crie um método recebeAumento que aumenta o salario do
 * funcionário de acordo com o parâmetro passado como argumento. Crie
 * também um método calculaGanhoAnual, que não recebe parâmetro
 * algum, devolvendo o valor do salário multiplicado por 12.
 * 
 * Teste-a, usando uma outra classe que tenha o main. Você deve criar a
 * classe do funcionário com o nome Funcionario, mas pode nomear como
 * quiser a classe de testes, contudo, ela deve possuir o método main.
 */
public class TesteExercicio00POO {
    public static void main(String[] args) {
        Funcionarios func1 = new Funcionarios("Antonio", "Serviços Gerais",
                1650.25, "04/03/2022", "1020304-0/PR");
        
        func1.imprimirInformacoes();
        
        System.out.print("O novo salário de " + func1.getNome() + " será: R$ ");
        System.out.format("%.2f", func1.recebeAumento(func1.getSalario(), 15.5));
        System.out.println("");
        System.out.print("O ganho anual de " + func1.getNome() + " foi: R$ ");
        System.out.format("%.2f", func1.calculaGanhoAnual());
        System.out.println("");
    }
}