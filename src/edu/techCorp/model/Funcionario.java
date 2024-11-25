package edu.techCorp.model;

import java.util.ArrayList;


abstract class Funcionario {
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

    public static void aumentarSalario(int index, double aumento){
        // Ele pegará o indice e fará a mudança correspondente a posição no ArrayList

        if(index >= 0 && index < funcionarios.size()){
            Funcionario funcionario = funcionarios.get(index);
            funcionario.salario += aumento;
        }
    }

    public static void listarFuncionariosPorTipo(String tipo) {
        System.out.println("Funcionários do tipo: " + tipo);
        for (Funcionario func : funcionarios) {
            if (func.getTipo().equalsIgnoreCase(tipo)) {
                func.mostrarDetalhes();
            }
        }
    }

    public abstract void mostrarDetalhes();
}
