package edu.techCorp.model;

import edu.techCorp.model.Interface.Treina;

public class Treinador extends Funcionario implements Treina{
    
    public Treinador(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void mostrarDetalhes(){

    }
    @Override
    public void ensinarTecnologia(){

    }

    @Override
    public void motivarEquipe(){

    }

}
