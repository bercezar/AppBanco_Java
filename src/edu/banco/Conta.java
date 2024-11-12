package edu.banco;

public class Conta {
    private String titular;
    private int numeroConta;
    private float saldoAtual;

    public Conta(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoAtual = 0.0f; // Inicializa saldo como zero
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldoAtual() {
        return saldoAtual;
    }

    public void realizarSaque(float valor) {
        if (saldoAtual - valor < 0) {
            System.out.println("Saque não autorizado: saldo insuficiente.");
        } else {
            saldoAtual -= valor;
            System.out.println("Saque de " + valor + " efetuado com sucesso.");
        }
    }

    public void realizarDeposito(float valor) {
        saldoAtual += valor;
        System.out.println("Depósito de " + valor + " efetuado com sucesso.");
    }
}
