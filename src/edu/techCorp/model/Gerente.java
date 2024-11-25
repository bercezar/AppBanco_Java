package edu.techCorp.model;

import java.util.ArrayList;

import edu.techCorp.model.Interface.Gerencia;

public class Gerente extends Funcionario implements Gerencia{
    
    private static ArrayList<Gerente> gerentes = new ArrayList<>();

    public Gerente(String id, String nome, double salario){
        super(id, nome, salario);
        gerentes.add(this);
    }

    @Override
    public void mostrarDetalhes(){
        for (Gerente gerente : gerentes){
            System.out.println("ID: " + gerente.getId() + ", Nome: " + gerente.getNome() + ", Salario: " + gerente.getSalario());
        }

    }

    @Override
    public void organizarEquipe(){

    }
    
    @Override
    public void conduzirReunioes(){

    }

}
