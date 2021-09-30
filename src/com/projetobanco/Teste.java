package com.projetobanco;

public class Teste {
    public static void main(String[] args) {

        System.out.println("*** Teste Conta Bancária ***");

        ContaBancária contaSimples = new ContaBancária();
        contaSimples.setNomeCliente("Cliente Conta Poupança");
        contaSimples.setNumConta("11111");


        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(01);//dia de rendimento

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca, 70);

        if(contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Novo Rendimento aplicado, saldo do dia é de: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, saldo do dia não alterado");
        }

        System.out.println(contaPoupanca);

        System.out.println("*** Teste Conta Especial ***");

        ContaEspecial ContaEspecial = new ContaEspecial();
        ContaEspecial.setNomeCliente("Cliente Conta Especial");
        ContaEspecial.setNumConta("33333");
        ContaEspecial.setLimite(50);


        ContaEspecial.depositar(100);

        realizarSaque(ContaEspecial, 50);

        realizarSaque(ContaEspecial, 70);

        realizarSaque(ContaEspecial, 80);

        System.out.println(ContaEspecial);
    }

    private static void realizarSaque(ContaBancária conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para o saque de: " + 70 + " saldo de: " + conta.getSaldo());
        }
    }
}
