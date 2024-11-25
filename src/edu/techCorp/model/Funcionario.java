package edu.techCorp.model;

import java.util.ArrayList;


public abstract class Funcionario {
    private String id;
    private String nome;
    private Double salario;
    protected String tipo;

    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public Funcionario(String id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.tipo = this.getClass().getSimpleName();  // Define o "tipo" de acordo com a subclasse
        funcionarios.add(this); // Adiciona o funcionário à lista automaticamente
    }
    
    public String getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }

    public Double getSalario(){
        return salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static void aumentarSalario(String id, double aumento){
        for (Funcionario funcionario : funcionarios) { // Itera pela lista de funcionários
            if (funcionario.getId().equals(id)) { // Verifica se o ID corresponde
                funcionario.setSalario(funcionario.getSalario() + aumento); // Atualiza o salário
                System.out.println("Salário do funcionário com ID " + id + " atualizado para: " + funcionario.getSalario());
                return; 
            }
        }
    }

    public static void listarFuncionarios() {
        for (Funcionario func : funcionarios) {
            System.out.println("ID: " + func.getId() + ", Nome: " + func.getNome() + ", Salário: " + func.getSalario() + ", Tipo: " + func.getTipo());
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + salario + ", Tipo: " + tipo;
    }

    

    public abstract void mostrarDetalhes();
}
