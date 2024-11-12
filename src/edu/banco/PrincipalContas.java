package edu.banco;

import java.util.Scanner;

public class PrincipalContas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando instâncias de contas
        Conta conta1 = new Conta("João Silva", 12345);
        ContaPoupanca conta2 = new ContaPoupanca("Maria Oliveira", 54321, 5);
        ContaEspecial conta3 = new ContaEspecial("Carlos Pereira", 67890, 500.0f);

        // Operações nas contas
        conta1.realizarDeposito(1000);
        conta1.realizarSaque(200);
        
        conta2.realizarDeposito(1500);
        conta2.atualizarSaldo(0.02f); // 2% de rendimento
        
        conta3.realizarDeposito(800);
        conta3.realizarSaque(1300); // Permitido devido ao limite

        // Exibindo dados das contas
        System.out.println("Dados da Conta de " + conta1.getTitular() + ":");
        System.out.println("Número da conta: " + conta1.getNumeroConta() + ", Saldo: " + conta1.getSaldoAtual());
        
        System.out.println("Dados da Conta de " + conta2.getTitular() + ":");
        System.out.println("Número da conta: " + conta2.getNumeroConta() + ", Saldo: " + conta2.getSaldoAtual());
        
        System.out.println("Dados da Conta de " + conta3.getTitular() + ":");
        System.out.println("Número da conta: " + conta3.getNumeroConta() + ", Saldo: " + conta3.getSaldoAtual());
        
        scanner.close();
    }
}
