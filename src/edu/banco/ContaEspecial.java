package edu.banco;

public class ContaEspecial extends Conta {
    private float limite;

    public ContaEspecial(String titular, int numeroConta, float limite) {
        super(titular, numeroConta);
        this.limite = limite;
    }

    @Override
    public void realizarSaque(float valor) {
        if (getSaldoAtual() + limite < valor) {
            System.out.println("Saque não autorizado: saldo e limite insuficientes.");
        } else {
            super.realizarSaque(valor);
        }
    }

    public float getLimite() {
        return limite;
    }
}
