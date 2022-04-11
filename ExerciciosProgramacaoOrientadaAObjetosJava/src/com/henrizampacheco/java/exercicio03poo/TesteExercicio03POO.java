package com.henrizampacheco.java.exercicio03poo;

/**3. Crie uma classe para representar uma conta-corrente, com métodos para
 * depositar uma quantia, sacar uma quantia e obter o saldo. Para cada saque
 * será debitada também uma taxa de operação equivalente à 0,5% do valor sacado.
 * Para a criação de objetos dessa classe será possível (opcional) informar o
 * valor do saldo da conta.
 */
public class TesteExercicio03POO {
    public static void main(String[] args) {
        ContaCorrente cliente1 = new ContaCorrente("Fernanda", 1, 2090.50);
        ContaCorrente cliente2 = new ContaCorrente("Valdemar", 2, 1250.00);
        
        cliente1.depositarQuantia(110.00);
        cliente1.sacarQuantia(700.00);
        
        cliente2.sacarQuantia(1230.00);
        cliente2.depositarQuantia(88.00);
    }
}
