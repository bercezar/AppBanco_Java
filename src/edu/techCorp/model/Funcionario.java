package edu.techCorp.model;

import java.util.ArrayList;


abstract class Funcionario {
    private ArrayList<String> nome;
    private ArrayList<Double> salario;

    public Funcionario(){
        nome = new ArrayList<>();
        salario = new ArrayList<>();
    }

    public ArrayList<String> getNome(){
        return nome;
    }

    public ArrayList<Double> getSalario(){
        return salario;
    }

    public void receberAumento(int index, double aumento){
        // Ele pegará o indice e fará a mudança correspondente a posição no ArrayList
        if(index >= 0 && index < salario.size()){
            salario.set(index, salario.get(index) + aumento);
        }
    }

    public abstract void mostrarDetalhes();
}
