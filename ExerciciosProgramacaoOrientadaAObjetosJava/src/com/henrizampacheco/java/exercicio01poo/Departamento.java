package com.henrizampacheco.java.exercicio01poo;

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
public class Departamento {
    private String nomeDpto;
    private Funcionario[] funcionarioDpto = new Funcionario[100];
    private int contFunc = 0;

    public Departamento(String nomeDpto) {
        this.setNomeDpto(nomeDpto);
    }
    
    public String getNomeDpto() {
        return nomeDpto;
    }

    public void setNomeDpto(String nomeDpto) {
        this.nomeDpto = nomeDpto;
    }

    public Funcionario[] getFuncionarioDpto() {
        return funcionarioDpto;
    }

    public void adicionarFuncionarioDpto(Funcionario funcionarioDpto) {
        this.funcionarioDpto[contFunc] = funcionarioDpto;
        contFunc++;        
    }
    
    @Override
    public String toString() {
        return "Departamento: " + nomeDpto;
    }
}
