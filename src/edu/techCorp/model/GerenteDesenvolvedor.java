package edu.techCorp.model;

import edu.techCorp.model.Interface.Desenvolve;
import edu.techCorp.model.Interface.Gerencia;


public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve{
    

    public GerenteDesenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void mostrarDetalhes(){

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
