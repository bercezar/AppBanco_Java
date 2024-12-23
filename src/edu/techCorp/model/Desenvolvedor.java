package edu.techCorp.model;

import java.util.ArrayList;

import edu.techCorp.model.Interface.Desenvolve;

public class Desenvolvedor extends Funcionario implements Desenvolve{

    private ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();
    
    public Desenvolvedor(String id, String nome, double salario){
        super(id ,nome, salario);
        desenvolvedores.add(this);

    }

    @Override
    public void mostrarDetalhes(){
        for (Desenvolvedor desenvolvedor : desenvolvedores){
            System.out.println("ID: " + desenvolvedor.getId() + ", Nome: " + desenvolvedor.getNome() + ", Salario: " + desenvolvedor.getSalario());
        }
    }


    @Override
    public void codar() {

    }

    @Override
    public void resolverProblemas() {

    }


}
