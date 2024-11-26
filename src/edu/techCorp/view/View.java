package edu.techCorp.view;

import java.util.Scanner;
import edu.techCorp.controller.Controller;

public class View {
    public static void main(String[] args) throws Exception{
        boolean variable = true;
        String id;
        String nome;
        String tipo;
        Double salario;
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
            System.out.println("6 -- Dar aumento");
            System.out.println("7 -- Encerrar");

            System.out.println("-----------------------------------------------------------");
            System.out.print("Informe:");
            String option = sc.nextLine();


            switch (option){
                case "1":
                    System.out.println("# Cadastrar Funcionário # - Opção Selecionada\n");
                    System.out.println("Informe o ID, Nome, Salario e  Tipo: ");
                    System.out.print("Tipo (Gerente/Treinador...): ");
                    tipo = sc.nextLine();
                    System.out.print("ID: ");
                    id = sc.nextLine();
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Salário: ");
                    salario = sc.nextDouble();
                    sc.nextLine();
                    Controller.cadastrarFuncionarios(id, nome, salario, tipo);
                    break;
                case "2":
                    System.out.println("# Listar Funcionários # - Opção Selecionada\n");
                    Controller.listarFuncionarios();
                    break;                
                case "3":
                    System.out.println("# Atualizar Dados do Funcionário # - Opção Selecionada");
                    System.out.println("#Informe o ID para identificação do funcionário a ser atualizado");
                    id = sc.nextLine();
                    System.out.println("Novo nome: ");
                    nome = sc.nextLine();
                    System.out.println("Novo salario: ");
                    salario = sc.nextDouble();
                    Controller.atualizarDados(id, nome, salario);
                    break;
                case "4":
                    System.out.println("# Excluir Funcionário # - Opção Selecionada\n");
                    System.out.println("#Informe o ID para excluir funcionário");
                    id = sc.nextLine();
                    break;
                case "5":
                    System.out.println("# Recuperar Dados de Funcionários de Arquivo # - Opção Selecionada\n");
                    Controller.recuperarFuncionariosDeArquivo("FuncionariosTechCorp.txt");
                    break;
                case "6":
                    System.out.println("# Dar aumento # - Opção Selecionada\n");
                    System.out.println("#Informe o ID do funcionário");
                    id = sc.nextLine();
                    System.out.println("#Informe o valor do aumento");
                    salario = sc.nextDouble();
                    sc.nextLine();
                    Controller.aumento(id, salario);
                    break;
                case "7":
                    System.out.println("# Encerrar # - Opção Selecionada\n");
                    variable = false;
                    Controller.salvarFuncionariosEmArquivo("FuncionariosTechCorp.txt");
                    sc.close();
                    break;
            }
        }
    }
}
