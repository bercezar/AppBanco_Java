package edu.techCorp.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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

    public static void salvarFuncionariosEmArquivo(String nomeArquivo) {
        String caminhoArquivo = "src/edu/techCorp/" + nomeArquivo;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Funcionario funcionario : Funcionario.funcionarios) {
                writer.write(funcionario.toString()); 
                writer.newLine(); 
            }
            System.out.println("Dados dos funcionários salvos em: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados no arquivo: " + e.getMessage());
        }
    }
    
    public static void recuperarFuncionariosDeArquivo(String nomeArquivo) {
        String caminhoArquivo = "src/edu/techCorp/" + nomeArquivo;
        File arquivo = new File(caminhoArquivo);

        if (!arquivo.exists()) {
            System.out.println("O arquivo " + caminhoArquivo + " não existe.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            ArrayList<Funcionario> funcionariosRecuperados = new ArrayList<>();

            while ((linha = reader.readLine()) != null) {
                if (linha.trim().isEmpty()) continue; 
                
                String[] dados = linha.split(", ");
                if (dados.length < 4) {
                    System.out.println("Linha inválida no arquivo: " + linha);
                    continue;
                }

                String id = dados[0].split(": ")[1].trim();
                String nome = dados[1].split(": ")[1].trim();
                double salario = Double.parseDouble(dados[2].split(": ")[1].trim());
                String tipo = dados[3].split(": ")[1].trim();


                Funcionario funcionario = null;
                switch (tipo.toLowerCase()) {
                    case "gerente":
                        funcionario = new Gerente(id, nome, salario);
                        break;
                    case "treinador":
                        funcionario = new Treinador(id, nome, salario);
                        break;
                    case "desenvolvedor":
                        funcionario = new Desenvolvedor(id, nome, salario);
                        break;
                    case "gerente desenvolvedor":
                        funcionario = new GerenteDesenvolvedor(id, nome, salario);
                        break;
                    default:
                        System.out.println("Tipo inválido no arquivo: " + tipo);
                        continue;
                }

                funcionariosRecuperados.add(funcionario);
            }

            if (funcionariosRecuperados.isEmpty()) {
                System.out.println("O arquivo " + caminhoArquivo + " está vazio ou não contém dados válidos.");
            } else {
                Funcionario.funcionarios.addAll(funcionariosRecuperados);
                System.out.println("Funcionários recuperados do arquivo " + caminhoArquivo + " com sucesso.");
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter valores numéricos no arquivo: " + e.getMessage());
        }
    }
}

