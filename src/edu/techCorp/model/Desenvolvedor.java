package edu.techCorp.model;

import edu.techCorp.model.Interface.Desenvolve;

public class Desenvolvedor extends Funcionario implements Desenvolve{
    
    public Desenvolvedor(String nome, double salario){
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


}
