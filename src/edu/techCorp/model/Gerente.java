package edu.techCorp.model;

import java.util.ArrayList;

import edu.techCorp.model.Interface.Gerencia;

public class Gerente extends Funcionario implements Gerencia{
    
    private ArrayList<Gerente> gerentes = new ArrayList<>();

    public Gerente(String id, String nome, double salario){
        super(id, nome, salario);
        gerentes.add(this);
    }

    @Override
    public void mostrarDetalhes(){

    }

    @Override
    public void organizarEquipe(){

    }
    
    @Override
    public void conduzirReunioes(){

    }

}
