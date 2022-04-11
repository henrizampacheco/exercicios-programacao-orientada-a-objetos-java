package com.henrizampacheco.java.exercicio01poo;

import java.util.Scanner;

/**1. Crie uma classe que representa um funcionário, registrando seu nome,
 * salário e data de admissão. Em seguida, crie uma classe que represente um
 * departamento de uma empresa, registrando o nome e os funcionários que nele
 * trabalham (para isso use um vetor, considere um máximo de 100 funcionários).
 * Por fim, crie uma classe que representa uma empresa, registrando seu nome,
 * CNPJ e departamentos (considere um máximo de 10 departamentos).
 * Faça um programa que:
 * 
 * a) Crie uma empresa;
 * b) Adicione a esta empresa alguns departamentos;
 * c) Adicione aos departamentos alguns funcionários;
 * d) Dê aumento de 10% a todos os funcionários de um determinado departamento;
 * 
 * É esperado que seu código seja bem encapsulado. Por exemplo, para adicionar
 * um departamento em uma empresa (ou um funcionário a um departamento), não se
 * deve acessar o vetor (ou lista) de departamentos diretamente, mas sim ter um
 * método na classe que representa a empresa para adicionar um departamento.
 */
public class TesteExercicio01POO {
    public static void main(String[] args) {
        // a) Crie uma empresa:
        Empresa empresa1 = new Empresa("Copel Telecom", "123456789-0");
        
        // b) Adicione a esta empresa alguns departamentos:
        Departamento dpto1 = new Departamento("Dep. Administrativo");
        Departamento dpto2 = new Departamento("Dep. Financeiro");
        Departamento dpto3 = new Departamento("Dep. de Engenharia");

        empresa1.adicionarDptoEmpresa(dpto1);
        empresa1.adicionarDptoEmpresa(dpto2);
        empresa1.adicionarDptoEmpresa(dpto3);
        
        // c) Adicione aos departamentos alguns funcionários:
        Funcionario func1 = new Funcionario("Edilson", 1899.95, "05/03/2019");
        Funcionario func2 = new Funcionario("Juliana", 2099.95, "01/02/2017");
        Funcionario func3 = new Funcionario("Cláudio", 1699.95, "05/12/2020");

        dpto1.adicionarFuncionarioDpto(func1);
        dpto1.adicionarFuncionarioDpto(func2);
        dpto1.adicionarFuncionarioDpto(func3);
        
        Funcionario func4 = new Funcionario("Roberta", 2899.95, "25/04/2019");
        Funcionario func5 = new Funcionario("Rafael", 3099.95, "20/08/2017");
        Funcionario func6 = new Funcionario("Natália", 2699.95, "25/09/2020");

        dpto2.adicionarFuncionarioDpto(func4);
        dpto2.adicionarFuncionarioDpto(func5);
        dpto2.adicionarFuncionarioDpto(func6);
        
        Funcionario func7 = new Funcionario("Paulo", 10999.95, "01/04/2009");
        Funcionario func8 = new Funcionario("Jonas", 10599.95, "05/07/2010");
        Funcionario func9 = new Funcionario("Clair", 9599.95, "05/12/2012");   
        
        dpto3.adicionarFuncionarioDpto(func7);
        dpto3.adicionarFuncionarioDpto(func8);
        dpto3.adicionarFuncionarioDpto(func9);
        
        System.out.println("Salários do " + dpto1.getNomeDpto() + " antes do aumento:");
        System.out.println("");
        for(int i=0; i<dpto1.getFuncionarioDpto().length; i++) {
            if(dpto1.getFuncionarioDpto()[i] != null) {
                System.out.println(dpto1.getFuncionarioDpto()[i]);
            }
        }
        
        aumentarSalarios(dpto1);

        System.out.println("");
        System.out.println("Salários do " + dpto1.getNomeDpto() + " depois do aumento:");
        System.out.println("");
        
        for(int j=0; j<dpto1.getFuncionarioDpto().length; j++) {
            if(dpto1.getFuncionarioDpto()[j] != null) {
                System.out.println(dpto1.getFuncionarioDpto()[j]);
            }
        }
        System.out.println("");
    }
    
    // d) Dê aumento de 10% a todos os funcionários de um determinado departamento:   
    public static void aumentarSalarios(Departamento dptoEmpresa) {
        for(int cont=0; cont<dptoEmpresa.getFuncionarioDpto().length; cont++) {
            if(dptoEmpresa.getFuncionarioDpto()[cont] != null) {
                dptoEmpresa.getFuncionarioDpto()[cont].setSalario(dptoEmpresa.getFuncionarioDpto()[cont].getSalario() * 1.10);
            }    
        }
    }
}
