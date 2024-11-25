package edu.techCorp.view;

import java.util.Scanner;

public class View {
    public static void main(String[] args) throws Exception{
        boolean variable = true;
        Scanner sc = new Scanner(System.in);
        while (variable){
            System.out.println("-----------------------------------------------------------");
            System.out.println("Bem vindo ao sistema de cadastros");
            System.out.println("Tech Corp ##################");

            System.out.println("1 -- Cadastrar Funcionário");
            System.out.println("2 -- Listar Funcionários");
            System.out.println("3 -- Atualizar Dados do Funcionário");
            System.out.println("4 -- Excluir Funcionário");
            System.out.println("5 -- Recuperar Dados de Funcionários de Arquivo");
            System.out.println("6 -- Encerrar");

            System.out.println("-----------------------------------------------------------");
            System.out.print("Informe:");
            String option = sc.nextLine();


            switch (option){
                case "1":
                    System.out.println("# Cadastrar Funcionário # - Opção Selecionada\n");
                    break;
                case "2":
                    System.out.println("# Listar Funcionários # - Opção Selecionada\n");
                    break;                
                case "3":
                    System.out.println("# Atualizar Dados do Funcionário # - Opção Selecionada\n");
                    break;
                case "4":
                    System.out.println("# Excluir Funcionário # - Opção Selecionada\n");
                    break;
                case "5":
                    System.out.println("# Recuperar Dados de Funcionários de Arquivo # - Opção Selecionada\n");
                    break;
                case "6":
                    System.out.println("# Encerrar # - Opção Selecionada\n");
                    variable = false;
                    sc.close();
                    break;
            }
        }
    }
}
