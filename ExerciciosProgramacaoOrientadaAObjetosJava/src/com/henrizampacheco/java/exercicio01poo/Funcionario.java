package com.henrizampacheco.java.exercicio01poo;

import java.text.DecimalFormat;

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
public class Funcionario {
    private String nomeFunc;
    private double salario;
    private String dataAdmissao;
    private DecimalFormat df = new DecimalFormat("0.00");
    
    public Funcionario(String nomeFunc, double salario, String dataAdmissao) {
        this.setNomeFunc(nomeFunc);
        this.setSalario(salario);
        this.setDataAdmissao(dataAdmissao);
    }
        
    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    @Override
    public String toString() {
        return "Funcionário: " + nomeFunc + ". Salário: R$ " + df.format(salario) + ". Data de admissão: " + dataAdmissao;
    }
}
