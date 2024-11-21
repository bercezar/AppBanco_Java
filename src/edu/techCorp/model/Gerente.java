package edu.techCorp.model;

import edu.techCorp.model.Interface.Gerencia;

public class Gerente extends Funcionario implements Gerencia{
    

    public Gerente(String nome, double salario){
        super(nome, salario);
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
