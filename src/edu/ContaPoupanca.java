package edu;

public class ContaPoupanca extends Conta {
    private int diaRendimento;

    public ContaPoupanca(String titular, int numeroConta, int diaRendimento) {
        super(titular, numeroConta);
        this.diaRendimento = diaRendimento;
    }

    public void atualizarSaldo(float taxaRendimento) {
        float novoSaldo = getSaldoAtual() + (getSaldoAtual() * taxaRendimento);
        System.out.println("Saldo atualizado da conta poupança: " + novoSaldo);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }
}
