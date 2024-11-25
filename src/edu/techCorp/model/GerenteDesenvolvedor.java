package edu.techCorp.model;

import java.util.ArrayList;

import edu.techCorp.model.Interface.Desenvolve;
import edu.techCorp.model.Interface.Gerencia;


public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve{
    
    private ArrayList<GerenteDesenvolvedor> gerenteDevs = new ArrayList<>();

    public GerenteDesenvolvedor(String id, String nome, double salario){
        super(id ,nome, salario);
        gerenteDevs.add(this);

    }

    @Override
    public void mostrarDetalhes(){
        for (GerenteDesenvolvedor gerenteDev : gerenteDevs){
            System.out.println("ID: " + gerenteDev.getId() + ", Nome: " + gerenteDev.getNome() + ", Salario: " + gerenteDev.getSalario());
        }

    }


    @Override
    public void codar() {

    }

    @Override
    public void resolverProblemas() {

    }

    @Override
    public void organizarEquipe(){

    }
    
    @Override
    public void conduzirReunioes(){

    }

}
