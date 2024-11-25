package edu.techCorp.model;

import java.util.ArrayList;

import edu.techCorp.model.Interface.Treina;

public class Treinador extends Funcionario implements Treina{
    
    private ArrayList<Treinador> treinadores = new ArrayList<>();

    public Treinador(String id, String nome, double salario){
        super(id, nome, salario);
        treinadores.add(this);

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
