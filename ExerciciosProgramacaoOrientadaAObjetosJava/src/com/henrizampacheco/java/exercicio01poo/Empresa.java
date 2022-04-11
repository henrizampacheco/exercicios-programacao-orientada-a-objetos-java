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
public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private Departamento[] dptoEmpresa = new Departamento[10];
    private int contDpto = 0;

    public Empresa(String nomeEmpresa, String cnpj) {
        this.setNomeEmpresa(nomeEmpresa);
        this.setCnpj(cnpj);
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento[] getDptoEmpresa() {
        return dptoEmpresa;
    }

    public void adicionarDptoEmpresa(Departamento dptoEmpresa) {
        this.dptoEmpresa[contDpto] = dptoEmpresa;
        contDpto++;
    }

    @Override
    public String toString() {
        return "Empresa: " + nomeEmpresa + ". CNPJ: " + cnpj;
    }
}
