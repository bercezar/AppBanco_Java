package edu.hospital;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Paciente {
    private int numero;
    private double peso;
    private double altura;

    public Paciente(int numero, double peso, double altura) {
        this.numero = numero;
        this.peso = peso;
        this.altura = altura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void addPaciente(Paciente paciente) {
        String file = "C:\\Users\\bernardo\\OneDrive\\Documents\\AppsJava\\src\\edu\\hospital\\arquivo.txt";
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(paciente.numero + "," + paciente.peso + "," + paciente.altura + "\n");
            writer.close();
            System.out.println("Paciente adicionado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void listarPacientes(){
        String file = "C:\\Users\\bernardo\\OneDrive\\Documents\\AppsJava\\src\\edu\\hospital\\arquivo.txt";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while((line = reader.readLine()) != null){
                String[] pacienteData = line.split(",");
                if (pacienteData.length == 3){
                    System.out.println("Número: " + pacienteData[0] + ", Peso: " + pacienteData[1] + ", Altura: " + pacienteData[2]);
                }
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void atualizarPaciente(int numero, double pesoNovo, double alturaNovo){
        String file = "C:\\Users\\bernardo\\OneDrive\\Documents\\AppsJava\\src\\edu\\hospital\\arquivo.txt";
        File tempFile = new File("C:\\Users\\bernardo\\OneDrive\\Documents\\AppsJava\\src\\edu\\hospital\\tempFile.txt");
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try{
            reader = new BufferedReader(new FileReader(file));
            writer = new BufferedWriter(new FileWriter(tempFile));
            String line = reader.readLine();

            while((line = reader.readLine()) != null){
                String []pacienteData = line.split(",");

                if(Integer.parseInt(pacienteData[0]) == numero){
                    writer.write(numero + "," + pesoNovo + "," + alturaNovo + "\n");
                }
                else{
                    writer.write(line+"\n");
                }
            }
            reader.close();
            writer.close();

            File originalFile = new File(file);
            if (originalFile.delete()) {
                tempFile.renameTo(originalFile);
            } else {
                System.out.println("Erro ao excluir o arquivo original");
            }

            System.out.println("Atualização feita com sucesso");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void excluirPaciente(int numero){
        String file = "C:\\Users\\bernardo\\OneDrive\\Documents\\AppsJava\\src\\edu\\hospital\\arquivo.txt";
        File tempFile = new File("C:\\Users\\bernardo\\OneDrive\\Documents\\AppsJava\\src\\edu\\hospital\\tempFile.txt");
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            writer = new BufferedWriter(new FileWriter(tempFile));

            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] pacienteData = line.split(",");
                if (Integer.parseInt(pacienteData[0]) != numero) {
                    writer.write(line + "\n"); 
                }
            }

            reader.close();
            writer.close();

            File originalFile = new File(file);
            if (originalFile.delete()) {
                tempFile.renameTo(originalFile);
            } else {
                System.out.println("Falha ao excluir o arquivo original");
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
