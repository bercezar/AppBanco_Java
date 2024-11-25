package edu.techCorp.controller;

import edu.techCorp.model.Desenvolvedor;
import edu.techCorp.model.Funcionario;
import edu.techCorp.model.Gerente;
import edu.techCorp.model.GerenteDesenvolvedor;
import edu.techCorp.model.Treinador;


public class Controller {
    

    public static void cadastrarFuncionarios(String id, String nome, Double salario, String tipo){
        switch (tipo.toLowerCase()){
            case "gerente":
                new Gerente(id, nome, salario);
                break;
            case "treinador":
                new Treinador(id, nome, salario);
                break;
            case "desenvolvedor":
                new Desenvolvedor(id, nome, salario);
                break;
            case "gerente desenvolvedor":
                new GerenteDesenvolvedor(id, nome, salario);
                break;
            default:
                System.out.println("Tipo de funcionário inválido: " + tipo);
                return; 
        }
    }

    public static void listarFuncionarios() {
        Funcionario.listarFuncionarios();
    }

    public static void atualizarDados(String id, String nome, double salario){
        for(Funcionario func : Funcionario.funcionarios){
            if(func.getId().equals(id)){
                func.setNome(nome);
                func.setSalario(salario);
            }
        }
        System.out.println("Funcionario de ID " + id + "atualizado com sucesso");
    }

    public static void excluirFuncionario(String id){
        for(Funcionario func : Funcionario.funcionarios){
            if(func.getId().equals(id)){
                Funcionario.funcionarios.remove(func);
                System.out.println("Funcionario de ID " + id + "excluido com sucesso");
                return;
            }
        }
        System.out.println("Funcionario de ID " + id + "não encontrado");
    }

    public static void aumento(String id ,Double valor){
        Funcionario.aumentarSalario(id, valor);
    }
}
