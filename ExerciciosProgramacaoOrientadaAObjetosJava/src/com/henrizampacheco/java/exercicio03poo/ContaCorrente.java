package com.henrizampacheco.java.exercicio03poo;

/**3. Crie uma classe para representar uma conta-corrente, com métodos para
 * depositar uma quantia, sacar uma quantia e obter o saldo. Para cada saque
 * será debitada também uma taxa de operação equivalente à 0,5% do valor sacado.
 * Para a criação de objetos dessa classe será possível (opcional) informar o
 * valor do saldo da conta.
 */
public class ContaCorrente {
    private String nomeCliente;
    private int numeroConta;
    private double saldoConta;
    
    public ContaCorrente(String nome, int numero, double saldo) {
        setNomeCliente(nome);
        setNumeroConta(numero);
        setSaldoConta(saldo);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    public void depositarQuantia(double quantia) {
        System.out.println("*** DEPÓSITO ***");
        System.out.println("Saldo anterior: R$ " + getSaldoConta());
        System.out.println("Valor do depósito: R$ " + quantia);
        System.out.println("");
        
        setSaldoConta(getSaldoConta() + quantia);
        informarSaldo();
        System.out.println("---------------");
    }
    
    public void sacarQuantia(double quantia) {
        if((getSaldoConta() - quantia) - (quantia * 0.005) > 0) {
            System.out.println("*** SAQUE ***");
            System.out.println("Saldo anterior: R$ " + getSaldoConta());
            System.out.println("Valor do saque: R$ " + quantia);
            System.out.println("Valor da taxa de operação: R$ " + (quantia * 0.005));
            System.out.println("");
            
            setSaldoConta((getSaldoConta() - quantia) - (quantia * 0.005));
            informarSaldo();
            System.out.println("---------------");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void informarSaldo() {
        System.out.println("Correntista: " + getNomeCliente());
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Saldo atual: " + getSaldoConta());
        System.out.println("");
    }
}
