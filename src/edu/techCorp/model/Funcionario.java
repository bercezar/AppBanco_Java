package edu.techCorp.model;

import java.util.ArrayList;


abstract class Funcionario {
    private String nome;
    private Double salario;

    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        funcionarios.add(this);
    }
    
    public String getNome(){
        return nome;
    }

    public Double getSalario(){
        return salario;
    }

    public static void aumentarSalario(int index, double aumento){
        // Ele pegará o indice e fará a mudança correspondente a posição no ArrayList

        if(index >= 0 && index < funcionarios.size()){
            Funcionario funcionario = funcionarios.get(index);
            funcionario.salario += aumento;
        }
    }

    public abstract void mostrarDetalhes();
}
