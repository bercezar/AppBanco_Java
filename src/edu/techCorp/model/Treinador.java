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
        for (Treinador treinador : treinadores){
            System.out.println("ID: " + treinador.getId() + ", Nome: " + treinador.getNome() + ", Salario: " + treinador.getSalario());
        }

    }

    @Override
    public void ensinarTecnologia(){

    }

    @Override
    public void motivarEquipe(){

    }

}
