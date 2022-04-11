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
public class Funcionarios {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntradaBanco;
    private String rg;
    
    public Funcionarios (String nome, String departamento, double salario,
            String dataEntradaBanco, String rg) {
        setNome(nome);
        setDepartamento(departamento);
        setSalario(salario);
        setDataEntradaBanco(dataEntradaBanco);
        setRg(rg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Informações do funcionário:");
        System.out.println("");
        System.out.println("Nome: " + getNome());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: R$ " + getSalario());
        System.out.println("Data de Entrada no Banco: " + getDataEntradaBanco());
        System.out.println("RG: " + getRg());
        System.out.println("");
    }
    
    public double recebeAumento(double salario, double percAumento) {
        double novoSalario = salario + ((salario * percAumento) / 100);
        return novoSalario;
    }
    
    public double calculaGanhoAnual() {
        double ganhoAnual = getSalario() * 12;
        return ganhoAnual;
    }
}
